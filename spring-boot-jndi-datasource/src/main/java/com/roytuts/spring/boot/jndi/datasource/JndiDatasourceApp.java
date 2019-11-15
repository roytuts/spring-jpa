package com.roytuts.spring.boot.jndi.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.roytuts.spring.boot.jndi.datasource")
public class JndiDatasourceApp {

	public static void main(String[] args) {
		SpringApplication.run(JndiDatasourceApp.class, args);
	}

}
