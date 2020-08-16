package com.roytuts.spring.data.jpa.hibernate.usertype.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.hibernate.usertype.entity.Employee;
import com.roytuts.spring.data.jpa.hibernate.usertype.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Resource
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

}
