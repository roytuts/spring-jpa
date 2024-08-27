package com.roytuts.spring.boot.jndi.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.boot.jndi.datasource.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
