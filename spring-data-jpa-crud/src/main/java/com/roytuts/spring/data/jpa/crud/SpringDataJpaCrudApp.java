package com.roytuts.spring.data.jpa.crud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.roytuts.spring.data.jpa.crud.config.Config;
import com.roytuts.spring.data.jpa.crud.entity.Product;
import com.roytuts.spring.data.jpa.crud.entity.ProductType;
import com.roytuts.spring.data.jpa.crud.service.ProductService;
import com.roytuts.spring.data.jpa.crud.service.ProductTypeService;

@Configuration
public class SpringDataJpaCrudApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ProductService productService = context.getBean(ProductService.class);
		ProductTypeService productTypeService = context.getBean(ProductTypeService.class);

		// ProductTypes
		List<ProductType> productTypes = productTypeService.getAllProductTypes();
		System.out.println("All Product Types");
		System.out.println("-------------------------------------------------------------");
		productTypes.forEach(pt -> System.out.println(pt));
		System.out.println("-------------------------------------------------------------");

		ProductType productType = productTypeService.findProductTypeById(1);
		System.out.println("Product Type for type id 1");
		System.out.println("-------------------------------------------------------------");
		System.out.println(productType);
		System.out.println("-------------------------------------------------------------");

		ProductType productType2 = productTypeService.findProductTypeByName("Tab");
		System.out.println("Product Type for type name Tab");
		System.out.println("-------------------------------------------------------------");
		System.out.println(productType2);
		System.out.println("-------------------------------------------------------------");

		ProductType productType3 = productTypeService.findProductTypeByNameIgnoreCase("tab");
		System.out.println("Product Types for type name tab");
		System.out.println("-------------------------------------------------------------");
		System.out.println(productType3);
		System.out.println("-------------------------------------------------------------");
		
		ProductType productType4 = new ProductType();
		productType4.setProductTypeName("Software");
		productType4.setProductTypeDesc("All types of sotwares");
		productTypeService.saveProductType(productType4);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Product Type successfully saved");
		System.out.println("-------------------------------------------------------------");

		List<ProductType> productTypes2 = productTypeService.getAllProductTypes();
		System.out.println("All Product Types");
		System.out.println("-------------------------------------------------------------");
		productTypes2.forEach(pt -> System.out.println(pt));
		System.out.println("-------------------------------------------------------------");

		ProductType productType5 = new ProductType();
		productType5.setProductTypeId(4);
		productType5.setProductTypeName("Software");
		productType5.setProductTypeDesc("All types of sotware products");
		productTypeService.updateProductType(productType5);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Product Type successfully updated");
		System.out.println("-------------------------------------------------------------");

		List<ProductType> productTypes3 = productTypeService.getAllProductTypes();
		System.out.println("All Product Types");
		System.out.println("-------------------------------------------------------------");
		productTypes3.forEach(pt -> System.out.println(pt));
		System.out.println("-------------------------------------------------------------");

		ProductType productType6 = new ProductType();
		productType6.setProductTypeId(4);
		productTypeService.deleteProductType(productType6);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Product Type successfully deleted");
		System.out.println("-------------------------------------------------------------");

		List<ProductType> productTypes4 = productTypeService.getAllProductTypes();
		System.out.println("All Product Types");
		System.out.println("-------------------------------------------------------------");
		productTypes4.forEach(pt -> System.out.println(pt));
		System.out.println("-------------------------------------------------------------");

		// Products
		List<Product> products = productService.getAllProducts();
		System.out.println("All Products");
		System.out.println("-------------------------------------------------------------");
		products.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------------------");

		Product product = productService.findProductById(1);
		System.out.println("Product for id 1");
		System.out.println("-------------------------------------------------------------");
		System.out.println(product);
		System.out.println("-------------------------------------------------------------");

		product = productService.findProductByName("Samsung S7");
		System.out.println("Product for name Samsung S7");
		System.out.println("-------------------------------------------------------------");
		System.out.println(product);
		System.out.println("-------------------------------------------------------------");

		productType = productTypeService.findProductTypeById(0);
		product = new Product();
		product.setProductName("Gionee P5");
		product.setProductPrice(7750d);
		product.setProductDesc("Gionee 4G Volte Mobile");
		product.setProductType(productType);
		productService.saveProduct(product);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Product successfully saved");
		System.out.println("-------------------------------------------------------------");

		products = productService.getAllProducts();
		System.out.println("All Products");
		System.out.println("-------------------------------------------------------------");
		products.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------------------");

		product = productService.findProductById(5);
		product.setProductName("Gionee P5");
		product.setProductPrice(7800d);
		product.setProductDesc("Gionee 4G Volte Mobile");
		productService.updateProduct(product);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Product successfully updated");
		System.out.println("-------------------------------------------------------------");

		products = productService.getAllProducts();
		System.out.println("All Products");
		System.out.println("-------------------------------------------------------------");
		products.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------------------");

		product = productService.findProductById(5);
		productService.deleteProduct(product);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Product successfully deleted");
		System.out.println("-------------------------------------------------------------");

		products = productService.getAllProducts();
		System.out.println("All Products");
		System.out.println("-------------------------------------------------------------");
		products.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------------------");

		((ConfigurableApplicationContext) context).close();
	}

}
