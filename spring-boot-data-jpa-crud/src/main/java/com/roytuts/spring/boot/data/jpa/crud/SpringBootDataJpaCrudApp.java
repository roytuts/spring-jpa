package com.roytuts.spring.boot.data.jpa.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.roytuts.spring.boot.data.jpa.crud.entity")
@EnableJpaRepositories("com.roytuts.spring.boot.data.jpa.crud.repository")
public class SpringBootDataJpaCrudApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaCrudApp.class, args);
	}

}
