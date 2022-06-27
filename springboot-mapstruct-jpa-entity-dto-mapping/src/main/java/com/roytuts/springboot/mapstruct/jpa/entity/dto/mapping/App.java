package com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.service.EventService;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private EventService eventService;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Event Objects");
		System.out.println("---------------------------------------");
		eventService.getEvents().stream().forEach(e -> System.out.println(e));
		System.out.println("---------------------------------------");

		System.out.println("Event DTO Objects");
		System.out.println("---------------------------------------");
		eventService.getEventDtos().stream().forEach(e -> System.out.println(e));
		System.out.println("---------------------------------------");

		System.out.println("Event Object");
		System.out.println("---------------------------------------");
		System.out.println(eventService.getEvent(2));
		System.out.println("---------------------------------------");

		System.out.println("Event DTO Object");
		System.out.println("---------------------------------------");
		System.out.println(eventService.getEventDto(2));
		System.out.println("---------------------------------------");
	}

}
