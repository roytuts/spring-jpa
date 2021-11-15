package com.roytuts.spring.data.jpa.pageable.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.data.jpa.pageable.dto.NoteDto;
import com.roytuts.spring.data.jpa.pageable.service.NoteService;

@RestController
@CrossOrigin(origins = "*")
public class NoteRestController {

	@Autowired
	private NoteService noteService;

	@GetMapping("/notes")
	public Page<NoteDto> notes(Pageable pageable) {
		return noteService.notes(pageable);
	}

}
