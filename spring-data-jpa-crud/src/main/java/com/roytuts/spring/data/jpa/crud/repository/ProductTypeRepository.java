package com.roytuts.spring.data.jpa.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.roytuts.spring.data.jpa.crud.entity.ProductType;

public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

	@Query("select pt from ProductType pt where pt.productTypeName = ?1")
	ProductType findByProductTypeName(String productTypeName);

	// if you want case insensitive
	@Query("select pt from ProductType pt where upper(pt.productTypeName) = upper(?1)")
	ProductType findByProductTypeNameCaseInsensitive(String productTypeName);

}
