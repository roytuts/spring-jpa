package com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int artistId;

	@Column
	private String artistName;

	@OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
	private Set<Cd> cds = new HashSet<>();

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Set<Cd> getCds() {
		return cds;
	}

	public void setCds(Set<Cd> cds) {
		this.cds = cds;

		for (Cd cd : cds) {
			cd.setArtist(this);
		}
	}

}
