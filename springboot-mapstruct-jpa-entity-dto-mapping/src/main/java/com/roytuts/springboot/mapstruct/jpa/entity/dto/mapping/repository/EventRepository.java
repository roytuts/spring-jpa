package com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
