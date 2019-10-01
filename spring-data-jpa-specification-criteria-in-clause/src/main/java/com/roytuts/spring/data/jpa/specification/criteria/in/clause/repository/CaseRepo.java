package com.roytuts.spring.data.jpa.specification.criteria.in.clause.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.roytuts.spring.data.jpa.specification.criteria.in.clause.entity.Case;

public interface CaseRepo extends JpaRepository<Case, Integer>, JpaSpecificationExecutor<Case> {

}
