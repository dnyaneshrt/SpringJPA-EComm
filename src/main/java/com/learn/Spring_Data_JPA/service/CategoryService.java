package com.learn.Spring_Data_JPA.service;

import com.learn.Spring_Data_JPA.entities.Category;

public interface CategoryService {
	
	Category createCategoy(Category category);
	
	void doTransactionWithProductAndCategory();

}
