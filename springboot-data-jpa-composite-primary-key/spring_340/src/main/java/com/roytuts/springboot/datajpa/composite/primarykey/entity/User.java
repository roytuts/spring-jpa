package com.roytuts.springboot.datajpa.composite.primarykey.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table // (name = "user")
public class User {

	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@EmbeddedId
	private UserPKey userPKey;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userPKey=" + userPKey + "]";
	}

	public UserPKey getUserPKey() {
		return userPKey;
	}

	public void setUserPKey(UserPKey userPKey) {
		this.userPKey = userPKey;
	}

}
