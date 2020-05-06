package com.roytuts.spring.data.jpa.batch.insertion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.data.jpa.batch.insertion.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
