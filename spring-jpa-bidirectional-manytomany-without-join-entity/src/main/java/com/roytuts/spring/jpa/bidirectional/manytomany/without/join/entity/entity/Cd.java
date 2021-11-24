package com.roytuts.spring.jpa.bidirectional.manytomany.without.join.entity.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table
@Entity
public class Cd {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cdId;

	@Column
	private String cdTitle;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "artist_cd", joinColumns = @JoinColumn(name = "cd_id"), inverseJoinColumns = @JoinColumn(name = "artist_id"))
	private Set<Artist> artists;

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

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}

}
