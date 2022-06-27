package com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.dto.EventDto;
import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.entity.Event;

@Mapper(componentModel = "spring")
public interface EventMapper {

	EventDto toEventDto(Event event);

	List<EventDto> toEventDtos(List<Event> events);

	Event toEvent(EventDto eventDto);

}
