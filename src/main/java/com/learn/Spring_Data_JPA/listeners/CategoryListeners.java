package com.learn.Spring_Data_JPA.listeners;

import com.learn.Spring_Data_JPA.entities.Category;

import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;


public class CategoryListeners {

	@PrePersist
	public void beforePersist(Category category)
	{
	System.out.println("before persist method----");	
	}

	@PostPersist
	public void afterPersist(Category category)
	{
		System.out.println("after persist method----");
	}
}
