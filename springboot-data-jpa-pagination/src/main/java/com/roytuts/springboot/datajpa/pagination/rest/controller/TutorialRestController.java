package com.roytuts.springboot.datajpa.pagination.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.springboot.datajpa.pagination.dto.TutorialDto;
import com.roytuts.springboot.datajpa.pagination.service.TutorialService;

@RestController
@CrossOrigin(origins = "*")
public class TutorialRestController {

	@Autowired
	private TutorialService tutorialService;

	@GetMapping("/tutorials")
	public Page<TutorialDto> tutorials(Pageable pageable) {
		return tutorialService.paginatedTutorials(pageable);
	}

}
