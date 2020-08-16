package com.roytuts.spring.data.jpa.entity.graphs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roytuts.spring.data.jpa.entity.graphs.entity.Department;
import com.roytuts.spring.data.jpa.entity.graphs.service.DepartmentService;

@SpringBootApplication
public class SpringDataJpaEntityGraphApp implements CommandLineRunner {

	@Autowired
	private DepartmentService departmentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaEntityGraphApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department department = departmentService.getDepartmentById(10);

		System.out.println("Department name: " + department);
		department.getEmployeeCollection().stream().forEach(emp -> System.out.println(emp));
	}

}
