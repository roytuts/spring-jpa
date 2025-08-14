package com.roytuts.springboot.datajpa.pagination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.roytuts.springboot.datajpa.pagination.converter.EntityDtoConverter;
import com.roytuts.springboot.datajpa.pagination.dto.TutorialDto;
import com.roytuts.springboot.datajpa.pagination.entity.Tutorial;
import com.roytuts.springboot.datajpa.pagination.repository.TutorialRepository;

@Service
public class TutorialService {

	@Autowired
	private TutorialRepository tutorialRepository;

	public Page<TutorialDto> paginatedTutorials(Pageable pageable) {
		Page<Tutorial> tutorials = tutorialRepository.findAll(pageable);

		Page<TutorialDto> paginatedTutorials = tutorials.map(entity -> {
			TutorialDto tutorialDto = EntityDtoConverter.toDto(entity);
			return tutorialDto;
		});

		return paginatedTutorials;
	}

}
