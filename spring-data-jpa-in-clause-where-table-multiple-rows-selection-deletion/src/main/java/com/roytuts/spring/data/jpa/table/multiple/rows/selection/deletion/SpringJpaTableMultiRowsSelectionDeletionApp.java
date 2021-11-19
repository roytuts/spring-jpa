package com.roytuts.spring.data.jpa.table.multiple.rows.selection.deletion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(basePackages = "com.roytuts.spring.data.jpa.table.multiple.rows.selection.deletion.entity")
@EnableJpaRepositories(basePackages = "com.roytuts.spring.data.jpa.table.multiple.rows.selection.deletion.repository")
public class SpringJpaTableMultiRowsSelectionDeletionApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaTableMultiRowsSelectionDeletionApp.class, args);
	}

}
