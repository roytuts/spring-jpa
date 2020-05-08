package com.roytuts.spring.data.jpa.table.multiple.rows.selection.deletion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.data.jpa.table.multiple.rows.selection.deletion.entity.Product;
import com.roytuts.spring.data.jpa.table.multiple.rows.selection.deletion.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> getProducts() {
		return repository.findAll();
	}

	public List<Product> getProductsByIds(List<Integer> ids) {
		return repository.findProductsByIds(ids);
	}

	@Transactional
	public void deleteProducts(List<Integer> ids) {
		repository.deleteProductsByIds(ids);
	}

}
