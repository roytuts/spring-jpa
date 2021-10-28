package com.roytuts.spring.data.jpa.criteriaupdate.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.data.jpa.criteriaupdate.entity.Product;

@Service
public class UpdateService {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void updateBulkProducts(final String productName, final double price) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

		CriteriaUpdate<Product> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Product.class);

		Root<Product> root = criteriaUpdate.from(Product.class);

		criteriaUpdate.set("price", price);
		criteriaUpdate.where(criteriaBuilder.equal(root.get("name"), productName));

		entityManager.createQuery(criteriaUpdate).executeUpdate();
	}

}
