package com.roytuts.spring.data.jpa.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.data.jpa.crud.entity.Product;
import com.roytuts.spring.data.jpa.crud.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		List<Product> products = productRepository.findAll();
		return products;
	}

	public Product findProductById(int id) {
		return productRepository.findById(id).get();
	}

	public Product findProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}

	@Transactional
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	@Transactional
	public void updateProduct(Product product) {
		productRepository.updateProduct(product.getProductName(), product.getProductDesc(), product.getProductPrice(),
				product.getProductId());
	}

	@Transactional
	public void deleteProduct(Product product) {
		productRepository.deleteProduct(product.getProductId());
	}

}
