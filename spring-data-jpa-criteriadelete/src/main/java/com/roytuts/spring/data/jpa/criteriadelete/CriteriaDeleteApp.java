package com.roytuts.spring.data.jpa.criteriadelete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.roytuts.spring.data.jpa.criteriadelete.service.DeleteService;

@SpringBootApplication
@EntityScan(basePackages = "com.roytuts.spring.data.jpa.criteriadelete.entity")
public class CriteriaDeleteApp implements CommandLineRunner {

	@Autowired
	private DeleteService deleteService;

	public static void main(String[] args) {
		SpringApplication.run(CriteriaDeleteApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CriteriaDelete::Bulk Delete Started...");
		deleteService.deleteBulkProducts("Desktop");
		System.out.println("CriteriaDelete::Bulk Delete Done.");
	}

}
