package com.roytuts.spring.data.jpa.audit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
@EntityScan(basePackages = "com.roytuts.spring.data.jpa.audit.entity")
@EnableJpaRepositories(basePackages = "com.roytuts.spring.data.jpa.audit.repository")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
