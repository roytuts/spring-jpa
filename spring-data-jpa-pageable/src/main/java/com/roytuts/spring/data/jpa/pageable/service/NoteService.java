package com.roytuts.spring.data.jpa.pageable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.pageable.converter.EntityDtoConverter;
import com.roytuts.spring.data.jpa.pageable.dto.NoteDto;
import com.roytuts.spring.data.jpa.pageable.entity.Note;
import com.roytuts.spring.data.jpa.pageable.repository.NoteRepository;

@Service
public class NoteService {

	@Autowired
	private NoteRepository noteRepository;

	public Page<NoteDto> notes(Pageable pageable) {
		Page<Note> notes = noteRepository.findAll(pageable);

		Page<NoteDto> pages = notes.map(entity -> {
			NoteDto dto = EntityDtoConverter.entityToDto(entity);
			return dto;
		});

		return pages;
	}

}
