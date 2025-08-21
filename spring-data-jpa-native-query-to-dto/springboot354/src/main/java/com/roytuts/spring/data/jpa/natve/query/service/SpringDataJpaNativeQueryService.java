package com.roytuts.spring.data.jpa.natve.query.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.natve.query.dto.EventDto;
import com.roytuts.spring.data.jpa.natve.query.repository.SpringDataJpaNativeQueryRepository;

@Service
public class SpringDataJpaNativeQueryService {

	@Autowired
	private SpringDataJpaNativeQueryRepository repository;

	public List<EventDto> getEventList() {
		List<EventDto> eventList = repository.findAll().stream().map(e -> {
			EventDto dto = new EventDto();

			dto.setId(e.getId());
			dto.setTitle(e.getTitle());
			dto.setUrl(e.getUrl());
			dto.setClasz(e.getClasz());
			dto.setStart(e.getStartDate());
			dto.setEnd(e.getEndDate());

			return dto;
		}).collect(Collectors.toList());

		return eventList;

	}

	public List<com.roytuts.spring.data.jpa.natve.query.repository.SpringDataJpaNativeQueryRepository.Event> getEvents() {
		return repository.getEvents();
	}

	public List<EventDto> getEventList2() {
		return repository.getEventList();
	}

	public EventDto getEventById(int id) {
		return repository.getEventById(id);
	}

	public List<EventDto> getEventListByClaszAndEnd(String clasz, LocalDate end) {
		return repository.getEventsByClaszAndEnd(clasz, java.sql.Date.valueOf(end));
	}

}
