package com.roytuts.spring.jpa.unidirectional.manytoone;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roytuts.spring.jpa.unidirectional.manytoone.entity.Artist;
import com.roytuts.spring.jpa.unidirectional.manytoone.entity.Cd;
import com.roytuts.spring.jpa.unidirectional.manytoone.service.ManyToOneService;

@SpringBootApplication
public class ManyToOneUnidirectionalApp implements CommandLineRunner {

	@Autowired
	private ManyToOneService manyToOneService;

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneUnidirectionalApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// create Artist object
		Artist artist = new Artist();
		artist.setArtistName("Soumitra");

		// create CD
		Cd cd1 = new Cd();
		cd1.setCdTitle("Java");
		cd1.setArtist(artist);

		// create another CD
		Cd cd2 = new Cd();
		cd2.setCdTitle("PHP");
		cd2.setArtist(artist);

		manyToOneService.saveCdArtist(Arrays.asList(cd1, cd2));
	}

}
