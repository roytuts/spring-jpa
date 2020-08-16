package com.roytuts.spring.data.jpa.hibernate.usertype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roytuts.spring.data.jpa.hibernate.usertype.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaHibernateUserTypeApp implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaHibernateUserTypeApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeService.getEmployees().forEach(e -> System.out.println(e));
	}

}
