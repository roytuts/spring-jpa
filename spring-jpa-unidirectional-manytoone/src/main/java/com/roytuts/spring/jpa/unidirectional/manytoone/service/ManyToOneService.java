package com.roytuts.spring.jpa.unidirectional.manytoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.jpa.unidirectional.manytoone.entity.Cd;
import com.roytuts.spring.jpa.unidirectional.manytoone.repository.CdRepository;

@Service
public class ManyToOneService {

	@Autowired
	private CdRepository cdRepository;

	public void saveCdArtist(List<Cd> cds) {
		cdRepository.saveAll(cds);
	}

}
