package com.roytuts.spring.boot.jndi.datasource.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.boot.jndi.datasource.entity.Company;
import com.roytuts.spring.boot.jndi.datasource.service.CompanyService;

@RestController
public class CompanyRestController {

	@Autowired
	private CompanyService companyService;

	@GetMapping("/company")
	public ResponseEntity<List<Company>> getCompanyList() {
		return new ResponseEntity<List<Company>>(companyService.getCompanyList(), HttpStatus.OK);
	}

}
