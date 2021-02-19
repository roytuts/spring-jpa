package com.roytuts.spring.data.jpa.left.right.inner.cross.join;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.roytuts.spring.data.jpa.left.right.inner.cross.join.repository")
public class SpringDataJpaLeftRightInnerCrossJoinApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaLeftRightInnerCrossJoinApp.class, args);
	}

}
