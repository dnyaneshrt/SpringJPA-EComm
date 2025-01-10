package com.learn.Spring_Data_JPA.service.impl;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;

import com.learn.Spring_Data_JPA.entities.Product;
import com.learn.Spring_Data_JPA.exception.MyOwnException;
import com.learn.Spring_Data_JPA.repositories.ProductRepository;
import com.learn.Spring_Data_JPA.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	ProductRepository productRepository;

//	constructor injection
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public Product createProduct(Product product) {
		Product savedProduct = productRepository.save(product);
		return savedProduct;
	}

	@Override
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	@Override
	public Product getById(int productId) {
		return productRepository.findById(productId).orElseThrow(()->new RuntimeException("Invalid Product"));
	}

	@Override
	public List<Product> findProductsByOrderByPrice() {

		return productRepository.findProductsByOrderByPrice();
	}

	@Override
	public List<Product> findProductsByOrderByDescription() {

		return productRepository.findProductsByOrderByDescription();
	}

	@Override
	public List<Product> findProductContains(String keyword) {

		return productRepository.findProductsByDescriptionContaining(keyword);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);

	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

}
