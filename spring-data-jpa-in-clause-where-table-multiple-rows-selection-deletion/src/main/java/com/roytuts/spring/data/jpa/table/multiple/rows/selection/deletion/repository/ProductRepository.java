package com.roytuts.spring.data.jpa.table.multiple.rows.selection.deletion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.roytuts.spring.data.jpa.table.multiple.rows.selection.deletion.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("SELECT p FROM Product p WHERE p.id IN (:ids)")
	public List<Product> findProductsByIds(@Param("ids") List<Integer> ids);

	@Modifying
	@Query("DELETE FROM Product p WHERE p.id IN (:ids)")
	public void deleteProductsByIds(@Param("ids") List<Integer> ids);

}
