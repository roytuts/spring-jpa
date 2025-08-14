package com.roytuts.springboot.datajpa.pagination.converter;

import com.roytuts.springboot.datajpa.pagination.dto.TutorialDto;
import com.roytuts.springboot.datajpa.pagination.entity.Tutorial;

public final class EntityDtoConverter {

	private EntityDtoConverter() {
	}

	public static Tutorial toEntity(TutorialDto tutorialDto) {
		Tutorial tutorial = new Tutorial(tutorialDto.getId(), tutorialDto.getContent());

		return tutorial;
	}

	public static TutorialDto toDto(Tutorial tutorial) {
		TutorialDto tutorialDto = new TutorialDto(tutorial.getId(), tutorial.getContent());

		return tutorialDto;
	}

}
