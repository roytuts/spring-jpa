package com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.entity.Artist;
import com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.entity.Cd;
import com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.repository.ArtistRepository;
import com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.repository.CdRepository;

@Service
public class ManyToOneOneToManyService {

	@Autowired
	private CdRepository cdRepository;

	@Autowired
	private ArtistRepository artistRepository;

	public void saveCdArtistList(List<Cd> cds) {
		cdRepository.saveAll(cds);
	}

	public void saveArtistCdList(Artist artist) {
		artistRepository.save(artist);
	}

}
