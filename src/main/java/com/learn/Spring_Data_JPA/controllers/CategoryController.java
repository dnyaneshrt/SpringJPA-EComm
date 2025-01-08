package com.learn.Spring_Data_JPA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Spring_Data_JPA.entities.Category;
import com.learn.Spring_Data_JPA.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@PostMapping("/category")
	public Category createCategory(@RequestBody Category category) {
		return categoryService.createCategoy(category);
	}

}
