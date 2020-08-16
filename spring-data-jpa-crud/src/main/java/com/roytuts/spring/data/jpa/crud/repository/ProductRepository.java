package com.roytuts.spring.data.jpa.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.data.jpa.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("select p from Product p where p.productName = ?1")
	Product findByProductName(String productName);

	@Modifying
	@Transactional
	@Query("UPDATE Product p SET p.productName = ?1, p.productDesc = ?2, p.productPrice = ?3"
			+ " WHERE p.productId = ?4")
	void updateProduct(String name, String desc, Double price, Integer id);

	@Modifying
	@Transactional
	@Query("DELETE FROM Product p WHERE p.productId = :id")
	void deleteProduct(@Param("id") Integer id);

}
