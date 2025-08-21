package com.roytuts.spring.data.jpa.natve.query.dto;

import java.util.Date;

public class EventDto {

	private int id;

	private String title;

	private String url;

	private String clasz;

	private Date start;

	private Date end;

	public EventDto() {
	}

	public EventDto(int id, String title, String url, String clasz, Date start, Date end) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.clasz = clasz;
		this.start = start;
		this.end = end;
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

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "EventDto [id=" + id + ", title=" + title + ", url=" + url + ", clasz=" + clasz + ", start=" + start
				+ ", end=" + end + "]";
	}

}
