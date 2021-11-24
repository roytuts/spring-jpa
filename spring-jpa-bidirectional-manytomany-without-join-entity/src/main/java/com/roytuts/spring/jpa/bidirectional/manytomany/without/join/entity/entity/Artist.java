package com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table
@Entity
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int artistId;

	@Column
	private String artistName;

	@ManyToMany(mappedBy = "artists", cascade = CascadeType.ALL)
	private Set<Cd> cds;

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
	}

}
