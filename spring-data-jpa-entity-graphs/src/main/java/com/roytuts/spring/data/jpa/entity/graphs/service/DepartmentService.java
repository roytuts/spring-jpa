package com.roytuts.spring.data.jpa.entity.graphs.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.entity.graphs.entity.Department;
import com.roytuts.spring.data.jpa.entity.graphs.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Resource
	private DepartmentRepository departmentRepository;

	public Department getDepartmentById(int deptId) {
		return departmentRepository.findByDeptId(deptId);
	}

}
