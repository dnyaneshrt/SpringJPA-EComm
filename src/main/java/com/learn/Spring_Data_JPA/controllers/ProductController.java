package com.learn.Spring_Data_JPA.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Spring_Data_JPA.entities.Product;
import com.learn.Spring_Data_JPA.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to E-Commerse Application!!";
	}
	
	@GetMapping("/products")
	public List<Product> showAllProducts()
	{
		return productService.getAllProducts();
	}

	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product)
	{
		return productService.createProduct(product);
	}
	
	@GetMapping("/products/{ProductId}")
	public Product showProduct(@PathVariable String ProductId )
	{
		return productService.getById(Integer.parseInt(ProductId));
	}
	
	@DeleteMapping("/products/{ProductId}")
	public void deleteProduct(@PathVariable String ProductId )
	{
		 productService.deleteProduct(Integer.parseInt(ProductId));
		 System.out.println("Product deleted successfully!");
	}
	
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product)
	{
		return productService.createProduct(product);
	}
	

}
