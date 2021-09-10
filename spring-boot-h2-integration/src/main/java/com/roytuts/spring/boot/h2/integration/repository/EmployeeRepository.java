package com.roytuts.spring.boot.h2.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.boot.h2.integration.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByName(String name);

	Employee findByEmail(String email);

}
