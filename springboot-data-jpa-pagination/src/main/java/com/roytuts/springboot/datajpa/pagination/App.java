package com.roytuts.springboot.datajpa.pagination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.roytuts.springboot.datajpa.pagination.entity")
@EnableJpaRepositories(basePackages = "com.roytuts.springboot.datajpa.pagination.repository")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
