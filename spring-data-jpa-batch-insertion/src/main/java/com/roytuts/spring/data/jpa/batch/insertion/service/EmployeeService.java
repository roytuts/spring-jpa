package com.roytuts.spring.data.jpa.batch.insertion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.data.jpa.batch.insertion.entity.Employee;
import com.roytuts.spring.data.jpa.batch.insertion.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional
	public void saveEmployees(List<Employee> employees) {
		int size = employees.size();
		int counter = 0;

		List<Employee> temp = new ArrayList<>();

		for (Employee emp : employees) {
			temp.add(emp);

			if ((counter + 1) % 500 == 0 || (counter + 1) == size) {
				employeeRepository.saveAll(temp);
				temp.clear();
			}

			counter++;
		}
	}

}
