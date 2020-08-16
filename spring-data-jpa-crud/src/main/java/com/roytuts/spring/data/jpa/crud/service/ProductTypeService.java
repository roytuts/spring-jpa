package com.roytuts.spring.data.jpa.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.data.jpa.crud.entity.ProductType;
import com.roytuts.spring.data.jpa.crud.repository.ProductTypeRepository;

@Service
public class ProductTypeService {

	@Autowired
	private ProductTypeRepository productTypeRepository;

	public List<ProductType> getAllProductTypes() {
		return productTypeRepository.findAll();
	}

	public ProductType findProductTypeById(int id) {
		return productTypeRepository.findById(id).get();
	}

	public ProductType findProductTypeByName(String productTypeName) {
		return productTypeRepository.findByProductTypeName(productTypeName);
	}

	public ProductType findProductTypeByNameIgnoreCase(String productTypeName) {
		return productTypeRepository.findByProductTypeNameCaseInsensitive(productTypeName);
	}

	@Transactional
	public void saveProductType(ProductType productType) {
		productTypeRepository.save(productType);
	}

	@Transactional
	public void updateProductType(ProductType productType) {
		productTypeRepository.save(productType);
	}

	@Transactional
	public void deleteProductType(ProductType productType) {
		productTypeRepository.delete(productType);
	}

}
