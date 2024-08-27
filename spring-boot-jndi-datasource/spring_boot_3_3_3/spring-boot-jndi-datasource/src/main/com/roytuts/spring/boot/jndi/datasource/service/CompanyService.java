package com.roytuts.spring.boot.jndi.datasource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.boot.jndi.datasource.entity.Company;
import com.roytuts.spring.boot.jndi.datasource.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	public List<Company> getCompanyList() {
		return companyRepository.findAll();
	}

}
