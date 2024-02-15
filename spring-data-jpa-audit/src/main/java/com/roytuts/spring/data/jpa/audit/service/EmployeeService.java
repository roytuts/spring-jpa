package com.roytuts.spring.data.jpa.audit.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.audit.entity.Employee;
import com.roytuts.spring.data.jpa.audit.repository.EmployeeJpaRepository;
import com.roytuts.spring.data.jpa.audit.vo.EmployeeVo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeJpaRepository employeeJpaRepository;

	public void saveOrUpdateEmployee(EmployeeVo employee) {
		Employee emp = null;

		if (employee.getId() != null) {
			emp = employeeJpaRepository.findById(employee.getId()).get();

			if (emp == null) {
				return;
			}
		} else {
			emp = new Employee();
		}

		emp.setName(employee.getName());
		emp.setEmail(employee.getEmail());
		emp.setAddress(employee.getAddress());

		employeeJpaRepository.save(emp);
	}

	public List<EmployeeVo> getEmployees() {
		List<Employee> employees = employeeJpaRepository.findAll();

		return employees.stream().map(e -> {
			EmployeeVo employeeVo = new EmployeeVo();

			employeeVo.setId(e.getEmpId());
			employeeVo.setName(e.getName());
			employeeVo.setEmail(e.getEmail());
			employeeVo.setAddress(e.getAddress());

			return employeeVo;
		}).collect(Collectors.toList());
	}

}
