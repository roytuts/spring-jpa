package com.roytuts.spring.data.jpa.specification.criteria.in.clause.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "country")
	private Set<Case> cases;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Case> getCases() {
		return cases;
	}

	public void setCases(Set<Case> cases) {
		this.cases = cases;
	}

}