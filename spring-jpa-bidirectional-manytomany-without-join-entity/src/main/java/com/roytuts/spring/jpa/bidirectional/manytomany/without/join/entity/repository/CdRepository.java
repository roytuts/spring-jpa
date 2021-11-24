package com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity.Cd;

public interface CdRepository extends JpaRepository<Cd, Integer> {

}
