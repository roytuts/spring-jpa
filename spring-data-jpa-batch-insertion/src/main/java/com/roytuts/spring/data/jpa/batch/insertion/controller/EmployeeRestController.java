package com.roytuts.spring.data.jpa.batch.insertion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.data.jpa.batch.insertion.entity.Employee;
import com.roytuts.spring.data.jpa.batch.insertion.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employees/save")
	public ResponseEntity<Void> saveEmployees(@RequestBody List<Employee> employees) {
		employeeService.saveEmployees(employees);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}