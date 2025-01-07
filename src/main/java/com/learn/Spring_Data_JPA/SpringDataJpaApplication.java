package com.learn.Spring_Data_JPA;

import java.util.List;
import java.util.Scanner;

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
//	 product.setTitle("TVs");
//	 product.setDescription("Croma TV");
//	 product.setPrice(55000);
//	 product.setLive(true);
	 
	//CRUD operations.
	//1. insert product into DB.
//	Product createdProduct=	productService.createProduct(product);
//	System.out.println("Product created successfully!!!: "+createdProduct);
	
	
	//2. Read entire Product data. SELECT * FROM amit.jpa_product;
//	System.out.println("All products are as below:::::::::");
//	productService.getAllProducts().forEach(System.out::println);
	
//	while (true) {
//		System.out.println("Read product is based on ID:");
//		System.out.println("enter product id to read data: between 1 to 6");
//		int prod_id = new Scanner(System.in).nextInt();
//		System.out.println("product for id " + prod_id + " is:::------>" + productService.getById(prod_id));
//	
//		System.out.println("Do you want to exit? y/n");
//		String ch=new Scanner(System.in).nextLine();
//		if(ch.equals("Y")||ch.equals("y"))
//		{
//			System.exit(0);
//		}else
//		{
//			continue;
//		}
//	}
	
//	System.out.println("Get Products as per price sorting in Asecending order!!");
//	List<Product> products=productService.findProductsByOrderByPrice();
//	System.out.println(products);
	
//	System.out.println("Get Products as per Description sorting in Asecending order!!");
//	List<Product> products=productService.findProductsByOrderByDescription();
//	System.out.println(products);
	
//	List<Product> product=productService.findProductContains("tv");
//	System.out.println(product);
}
}
