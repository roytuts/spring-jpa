package com.roytuts.spring.data.jpa.entity.graphs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.data.jpa.entity.graphs.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
