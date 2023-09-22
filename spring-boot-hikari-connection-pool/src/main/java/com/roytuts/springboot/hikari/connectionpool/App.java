package com.roytuts.springboot.hikari.connectionpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roytuts.springboot.hikari.connectionpool.service.ItemService;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private ItemService itemService;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(itemService.getItem(2));

		System.out.println();
		System.out.println();

		itemService.getItemList().stream().forEach(i -> System.out.println(i));
	}

}
