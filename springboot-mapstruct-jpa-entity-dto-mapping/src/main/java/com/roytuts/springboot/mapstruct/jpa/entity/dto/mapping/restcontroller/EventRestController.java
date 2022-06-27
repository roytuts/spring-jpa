package com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.dto.EventDto;
import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.entity.Event;
import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.service.EventService;

@RestController
public class EventRestController {

	@Autowired
	private EventService eventService;

	@GetMapping("/events")
	public ResponseEntity<List<Event>> getEvents() {

		return new ResponseEntity<List<Event>>(eventService.getEvents(), HttpStatus.OK);
	}

	@GetMapping("/event/{id}")
	public ResponseEntity<Event> getEvents(@PathVariable Integer id) {

		return new ResponseEntity<Event>(eventService.getEvent(id), HttpStatus.OK);
	}

	@GetMapping("/eventDtos")
	public ResponseEntity<List<EventDto>> getEventDtos() {

		return new ResponseEntity<List<EventDto>>(eventService.getEventDtos(), HttpStatus.OK);
	}

	@GetMapping("/eventDto/{id}")
	public ResponseEntity<EventDto> getEventDto(@PathVariable Integer id) {

		return new ResponseEntity<EventDto>(eventService.getEventDto(id), HttpStatus.OK);
	}

}
