package com.roytuts.spring.image.blob.entity;

import java.io.Serializable;
import java.util.Base64;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")
public class Image implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@Lob
	private byte[] content;

	@Column(name = "save_date")
	private String date;

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

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String generateBase64Image() {
		return new String(Base64.getEncoder().encode(content));
	}

	public String getMimeType() {
		String ext = Objects.requireNonNull(name).substring(name.lastIndexOf('.') + 1).toLowerCase();

		if (ext.equals("jpeg") || ext.equals("jpe") || ext.equals("jpg")) {
			return "image/jpeg";
		}

		if (ext.equals("png")) {
			return "image/png";
		}

		if (ext.equals("gif")) {
			return "image/gif";
		}

		return "application/octet-stream";
	}

}
