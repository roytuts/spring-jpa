package com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}
