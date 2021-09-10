package com.roytuts.spring.boot.h2.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
// @Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue // (strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@Column(name = "email_address")
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
