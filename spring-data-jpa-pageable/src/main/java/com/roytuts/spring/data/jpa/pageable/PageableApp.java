package com.roytuts.spring.data.jpa.pageable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.roytuts.spring.data.jpa.pageable.entity")
@EnableJpaRepositories(basePackages = "com.roytuts.spring.data.jpa.pageable.repository")
public class PageableApp {

	public static void main(String[] args) {
		SpringApplication.run(PageableApp.class, args);
	}

}
