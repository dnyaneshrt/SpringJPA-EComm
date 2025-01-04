package com.learn.Spring_Data_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.Spring_Data_JPA.entities.Product;
import com.learn.Spring_Data_JPA.service.ProductService;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner{

	@Autowired
	ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	System.out.println("Starting E-commerse Application!!!");
		
//	 Product product=new Product();
//	 product.setTitle("Toys");
//	 product.setDescription("Kids Toys");
//	 product.setPrice(1500);
//	 product.setLive(true);
//	 
//		
//	Product createdProduct=	productService.createProduct(product);
//	System.out.println("Product created successfully!!!: "+createdProduct);
//	
//	System.out.println("All products are as below:::::::::");
//	productService.getAllProducts().forEach(System.out::println);
	
	
	System.out.println("below pproduct is based on ID:");
	System.out.println("product for id 2 is:::------>"+productService.getById(2));
	}
}
