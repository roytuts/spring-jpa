package com.roytuts.spring.boot.h2.integration.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.boot.h2.integration.entity.Employee;
import com.roytuts.spring.boot.h2.integration.repository.EmployeeRepository;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employee/name/{name}")
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable String name) {
		Employee employee = employeeRepository.findByName(name);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@GetMapping("/employee/email/{email}")
	public ResponseEntity<Employee> getEmployeeByEmail(@PathVariable String email) {
		Employee employee = employeeRepository.findByEmail(email);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

}
