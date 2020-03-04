package com.roytuts.spring.data.jpa.natve.query.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.roytuts.spring.data.jpa.natve.query.dto.EventDto;
import com.roytuts.spring.data.jpa.natve.query.model.Event;

public interface SpringDataJpaNativeQueryRepository extends JpaRepository<Event, Integer> {

	@Query(value = "SELECT e.id, e.title, e.url, e.clasz, UNIX_TIMESTAMP(start_date)*1000 as start, UNIX_TIMESTAMP(end_date)*1000 as end FROM event e", nativeQuery = true)
	public List<Event> getEvents();

	public interface Event {

		String getId();

		String getTitle();

		String getUrl();

		String getClasz();

		String getStart();

		String getEnd();

	}

	@Query("SELECT new com.roytuts.spring.data.jpa.natve.query.dto.EventDto(e.id, e.title, e.url, e.clasz, UNIX_TIMESTAMP(start_date)*1000 as start, UNIX_TIMESTAMP(end_date)*1000 as end) FROM Event e")
	public List<EventDto> getEventList();

	@Query("SELECT new com.roytuts.spring.data.jpa.natve.query.dto.EventDto(e.id, e.title, e.url, e.clasz, UNIX_TIMESTAMP(start_date)*1000 as start, UNIX_TIMESTAMP(end_date)*1000 as end) FROM Event e WHERE e.id = ?1")
	public EventDto getEventById(int id);

	@Query("SELECT new com.roytuts.spring.data.jpa.natve.query.dto.EventDto(e.id, e.title, e.url, e.clasz, UNIX_TIMESTAMP(start_date)*1000 as start, UNIX_TIMESTAMP(end_date)*1000 as end) FROM Event e WHERE e.clasz = ?1 AND UNIX_TIMESTAMP(end_date)*1000 = ?2")
	public List<EventDto> getEventsByClaszAndEnd(String clasz, long end);

}
