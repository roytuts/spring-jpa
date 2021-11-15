package com.roytuts.spring.data.jpa.pageable.converter;

import com.roytuts.spring.data.jpa.pageable.dto.NoteDto;
import com.roytuts.spring.data.jpa.pageable.entity.Note;

public final class EntityDtoConverter {

	private EntityDtoConverter() {
	}

	public static NoteDto entityToDto(Note note) {
		NoteDto noteDto = new NoteDto();

		noteDto.setId(note.getId());
		noteDto.setNote(note.getNote());

		return noteDto;
	}

	public static Note dtoToEntity(NoteDto noteDto) {
		Note note = new Note();

		note.setId(noteDto.getId());
		note.setNote(noteDto.getNote());

		return note;
	}

}
