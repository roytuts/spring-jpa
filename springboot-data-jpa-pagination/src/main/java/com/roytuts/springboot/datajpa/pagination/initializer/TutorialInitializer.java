package com.roytuts.springboot.datajpa.pagination.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roytuts.springboot.datajpa.pagination.entity.Tutorial;
import com.roytuts.springboot.datajpa.pagination.repository.TutorialRepository;

import jakarta.annotation.PostConstruct;

@Component
public class TutorialInitializer {

	@Autowired
	private TutorialRepository tutorialRepository;

	@PostConstruct
	private void loadNotes() {
		for (int i = 0; i < 1000; i++) {
			Tutorial tutorial = new Tutorial();
			tutorial.setContent("This is Tutorial #" + i);

			tutorialRepository.save(tutorial);
		}
	}

}
