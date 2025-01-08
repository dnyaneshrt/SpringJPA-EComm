package com.learn.Spring_Data_JPA.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.Spring_Data_JPA.entities.Category;
import com.learn.Spring_Data_JPA.entities.Product;
import com.learn.Spring_Data_JPA.repositories.CategoryRepository;
import com.learn.Spring_Data_JPA.repositories.ProductRepository;
import com.learn.Spring_Data_JPA.service.CategoryService;

import jakarta.transaction.Transactional;

@Service
public class CategoryImpl implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Category createCategoy(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	@Transactional
	public void doTransactionWithProductAndCategory() {
		 Product product=new Product();
		 product.setId(12);
		 product.setTitle("cosmetics");
		 product.setDescription("cosmetics products");
		 product.setLive(true);
		 product.setPrice(3500);
		 
		 productRepository.save(product);  // Product will be saved.
		 System.out.println("product saved");
		
		 Category category=new Category();
		 category.setCat_id(4);
//		 category.setTitle("cosmetics---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		 category.setTitle("cosmetics");
			
		 categoryRepository.save(category);
		 System.out.println("category saved..");
	}


}
