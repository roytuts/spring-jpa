package com.roytuts.spring.data.jpa.specification.criteria.in.clause.rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.data.jpa.specification.criteria.in.clause.criteria.CaseSearchCriteria;
import com.roytuts.spring.data.jpa.specification.criteria.in.clause.entity.Case;
import com.roytuts.spring.data.jpa.specification.criteria.in.clause.service.SearchCaseService;
import com.roytuts.spring.data.jpa.specification.criteria.in.clause.vo.CaseVo;

@RestController
public class CaseSearchController {

	@Autowired
	private SearchCaseService searchCaseService;

	@PostMapping("/search/cases")
	public ResponseEntity<List<CaseVo>> searchCases(@RequestBody CaseSearchCriteria caseSearchCriteria) {
		List<Case> cases = searchCaseService.searchCases(caseSearchCriteria);

		List<CaseVo> list = cases.stream().map(c -> {
			CaseVo vo = new CaseVo();
			vo.setCaseId(c.getId());
			vo.setRegion(c.getRegion().getName());
			vo.setCountry(c.getCountry().getName());
			return vo;
		}).collect(Collectors.toList());

		return new ResponseEntity<List<CaseVo>>(list, HttpStatus.OK);
	}

}
