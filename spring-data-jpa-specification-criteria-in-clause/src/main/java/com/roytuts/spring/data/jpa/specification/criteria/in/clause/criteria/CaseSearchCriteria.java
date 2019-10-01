package com.roytuts.spring.data.jpa.specification.criteria.in.clause.criteria;

import java.io.Serializable;
import java.util.List;

public class CaseSearchCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	private String country;
	private List<Integer> regionIds;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Integer> getRegionIds() {
		return regionIds;
	}

	public void setRegionIds(List<Integer> regionIds) {
		this.regionIds = regionIds;
	}
}
