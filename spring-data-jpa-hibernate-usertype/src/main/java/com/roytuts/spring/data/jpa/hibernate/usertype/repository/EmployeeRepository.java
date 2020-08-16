package com.roytuts.spring.data.jpa.hibernate.usertype.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.data.jpa.hibernate.usertype.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
