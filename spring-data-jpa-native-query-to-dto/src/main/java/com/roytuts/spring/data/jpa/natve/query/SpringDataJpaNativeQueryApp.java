package com.roytuts.spring.data.jpa.natve.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.roytuts.spring.data.jpa.natve.query.service.SpringDataJpaNativeQueryService;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.roytuts.spring.data.jpa.natve.query.repository")
public class SpringDataJpaNativeQueryApp implements CommandLineRunner {

	@Autowired
	private SpringDataJpaNativeQueryService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaNativeQueryApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=======================================");
		service.getEvents().stream()
				.forEach(e -> System.out.println("id=" + e.getId() + ", title=" + e.getTitle() + ", url=" + e.getUrl()
						+ ", clasz=" + e.getClasz() + ", start=" + e.getStart() + ", end=" + e.getEnd()));
		System.out.println("---------------------------------------");
		service.getEventList().stream().forEach(e -> System.out.println(e));
		System.out.println("---------------------------------------");
		service.getEventList2().stream().forEach(e -> System.out.println(e));
		System.out.println("---------------------------------------");
		System.out.println(service.getEventById(2));
		System.out.println("---------------------------------------");
		service.getEventListByClaszAndEnd("event-success", 1523370662000l).stream().forEach(e -> System.out.println(e));
		System.out.println("=======================================");
	}

}
