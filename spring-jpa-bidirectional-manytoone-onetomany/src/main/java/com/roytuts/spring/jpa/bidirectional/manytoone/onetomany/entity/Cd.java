package com.roytuts.spring.jpa.bidirectional.manytoone.onetomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Cd {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cdId;

	@Column
	private String cdTitle;

	@JoinColumn(name = "artistId")
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	private Artist artist;

	public int getCdId() {
		return cdId;
	}

	public void setCdId(int cdId) {
		this.cdId = cdId;
	}

	public String getCdTitle() {
		return cdTitle;
	}

	public void setCdTitle(String cdTitle) {
		this.cdTitle = cdTitle;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

}
