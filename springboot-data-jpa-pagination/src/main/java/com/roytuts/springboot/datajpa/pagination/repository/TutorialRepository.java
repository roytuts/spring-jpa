package com.roytuts.springboot.datajpa.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.springboot.datajpa.pagination.entity.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {

}
