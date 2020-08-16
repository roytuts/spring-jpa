package com.roytuts.spring.data.jpa.entity.graphs.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.data.jpa.entity.graphs.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	@EntityGraph(value = "department.employees", type = EntityGraphType.LOAD)
	Department findByDeptId(int deptId);

}
