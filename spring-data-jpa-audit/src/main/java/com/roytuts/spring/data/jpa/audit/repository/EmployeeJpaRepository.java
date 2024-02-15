package com.roytuts.spring.data.jpa.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.data.jpa.audit.entity.Employee;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {

}
