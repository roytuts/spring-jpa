package com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity.Artist;
import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity.Cd;
import com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.service.ManyToManyService;

@SpringBootApplication
@EntityScan("com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity")
@EnableJpaRepositories("com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.repository")
public class BidirectionalManyToManyWithoutJoinEntityApp implements CommandLineRunner {

	@Autowired
	private ManyToManyService manyToManyService;

	public static void main(String[] args) {
		SpringApplication.run(BidirectionalManyToManyWithoutJoinEntityApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Artist a1 = new Artist();
		a1.setArtistName("abc");

		Artist a2 = new Artist();
		a2.setArtistName("klm");

		Artist a3 = new Artist();
		a3.setArtistName("xyz");

		Set<Artist> artists = new HashSet<>();
		artists.add(a1);
		artists.add(a2);

		Cd cd1 = new Cd();
		cd1.setCdTitle("Java");

		Cd cd2 = new Cd();
		cd2.setCdTitle("PHP");

		Cd cd3 = new Cd();
		cd3.setCdTitle("MySQL");

		Set<Cd> cds = new HashSet<>();
		cds.add(cd1);
		cds.add(cd2);

		a3.setCds(cds);

		cd3.setArtists(artists);

		manyToManyService.saveArtist(a3);
		manyToManyService.saveCd(cd3);
	}

}
