package com.roytuts.spring.data.jpa.pageable.initializer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roytuts.spring.data.jpa.pageable.entity.Note;
import com.roytuts.spring.data.jpa.pageable.repository.NoteRepository;

@Component
public class NoteInitializer {

	@Autowired
	private NoteRepository noteRepository;

	@PostConstruct
	private void loadNotes() {
		for (int i = 0; i < 1000; i++) {
			Note note = new Note();
			note.setNote("Note " + i);

			noteRepository.save(note);
		}
	}

}
