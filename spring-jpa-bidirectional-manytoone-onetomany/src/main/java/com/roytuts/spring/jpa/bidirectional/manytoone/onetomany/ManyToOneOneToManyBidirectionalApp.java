package com.roytuts.spring.jpa.bidirectional.manytoone.onetomany;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.entity.Artist;
import com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.entity.Cd;
import com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.service.ManyToOneOneToManyService;

@SpringBootApplication
@EntityScan(basePackages = "com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.entity")
@EnableJpaRepositories(basePackages = "com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.repository")
public class ManyToOneOneToManyBidirectionalApp implements CommandLineRunner {

	@Autowired
	private ManyToOneOneToManyService manyToOneOneToManyService;

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneOneToManyBidirectionalApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------------------------------------------------");
		System.out.println("Many To One Testing");
		System.out.println("---------------------------------------------------");

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

		manyToOneOneToManyService.saveCdArtistList(Arrays.asList(cd1, cd2));

		System.out.println("---------------------------------------------------");
		System.out.println("One To Many Testing");
		System.out.println("---------------------------------------------------");

		artist = new Artist();
		artist.setArtistName("Soumitra");
		Set<Cd> cds = new HashSet<Cd>();

		cd1 = new Cd();
		cd1.setCdTitle("Java");
		cd1.setArtist(artist);

		cd2 = new Cd();
		cd2.setCdTitle("PHP");
		cd2.setArtist(artist);

		cds.add(cd1);
		cds.add(cd2);

		artist.setCds(cds);

		manyToOneOneToManyService.saveArtistCdList(artist);
	}

}
