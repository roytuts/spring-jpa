package com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity.Artist;
import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity.Cd;
import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.repository.ArtistRepository;
import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.repository.CdRepository;

@Service
public class ManyToManyService {

	@Autowired
	private CdRepository cdRepository;

	@Autowired
	private ArtistRepository artistRepository;

	public void saveCd(Cd cd) {
		cdRepository.save(cd);
	}

	public void saveArtist(Artist artist) {
		artistRepository.save(artist);
	}

}
