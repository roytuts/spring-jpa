package com.roytuts.spring.boot.h2.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.roytuts.spring.boot.h2.integration.entity")
@EnableJpaRepositories(basePackages = "com.roytuts.spring.boot.h2.integration.repository")
public class SpringH2App {

	public static void main(String[] args) {
		SpringApplication.run(SpringH2App.class, args);
	}

}
