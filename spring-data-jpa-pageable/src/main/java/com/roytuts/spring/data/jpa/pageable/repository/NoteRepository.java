package com.roytuts.spring.data.jpa.pageable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.data.jpa.pageable.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {

}
