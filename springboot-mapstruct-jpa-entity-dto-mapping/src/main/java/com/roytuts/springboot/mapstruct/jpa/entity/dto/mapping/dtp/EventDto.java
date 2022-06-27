package com.roytuts.springboot.mapstruct.jpa.entity.dto.mapping.dto;

import java.util.Date;

public class EventDto {

	private int id;

	private String title;

	private String url;

	private String clasz;

	private Date startDate;

	private Date endDate;

	public EventDto() {
	}

	public EventDto(int id, String title, String url, String clasz, Date startDate, Date endDate) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.clasz = clasz;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getClasz() {
		return clasz;
	}

	public void setClasz(String clasz) {
		this.clasz = clasz;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "EventDto [id=" + id + ", title=" + title + ", url=" + url + ", clasz=" + clasz + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

}
