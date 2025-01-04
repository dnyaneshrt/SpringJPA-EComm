package com.learn.Spring_Data_JPA.service;

import java.util.List;

import com.learn.Spring_Data_JPA.entities.Product;

public interface ProductService {
	
	Product createProduct(Product product);

	List<Product> getAllProducts();
	
	Product getById(int productId);
}
