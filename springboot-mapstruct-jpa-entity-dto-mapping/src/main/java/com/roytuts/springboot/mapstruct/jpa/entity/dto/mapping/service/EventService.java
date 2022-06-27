package com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.dto.EventDto;
import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.entity.Event;
import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.mapper.EventMapper;
import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private EventMapper eventMapper;

	public List<Event> getEvents() {
		return eventRepository.findAll();
	}

	public List<EventDto> getEventDtos() {
		return eventMapper.toEventDtos(eventRepository.findAll());
	}

	public EventDto getEventDto(Integer id) {
		return eventMapper.toEventDto(eventRepository.findById(id).orElseThrow());
	}

	public Event getEvent(Integer id) {
		return eventMapper.toEvent(getEventDto(id));
	}

}
