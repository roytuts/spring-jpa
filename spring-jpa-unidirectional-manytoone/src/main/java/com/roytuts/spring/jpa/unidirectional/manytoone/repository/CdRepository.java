package com.roytuts.spring.jpa.unidirectional.manytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.jpa.unidirectional.manytoone.entity.Cd;

public interface CdRepository extends JpaRepository<Cd, Integer> {

}
