package com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}
