package com.learn.Spring_Data_JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learn.Spring_Data_JPA.service.CategoryService;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	CategoryService categoryService;
	
	@Test
	public void testTransaction()
	{
		categoryService.doTransactionWithProductAndCategory();
	}
}
