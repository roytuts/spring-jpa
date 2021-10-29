package com.roytuts.spring.data.jpa.criteriadelete.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.data.jpa.criteriadelete.entity.Product;

@Service
public class DeleteService {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void deleteBulkProducts(final String productName) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

		CriteriaDelete<Product> criteriaDelete = criteriaBuilder.createCriteriaDelete(Product.class);

		Root<Product> root = criteriaDelete.from(Product.class);

		criteriaDelete.where(criteriaBuilder.equal(root.get("name"), productName));

		entityManager.createQuery(criteriaDelete).executeUpdate();
	}

}
