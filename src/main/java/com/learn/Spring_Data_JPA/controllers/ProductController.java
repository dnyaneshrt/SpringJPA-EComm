package com.learn.Spring_Data_JPA.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Spring_Data_JPA.entities.Product;
import com.learn.Spring_Data_JPA.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to E-Commerse Application!!";
	}
	
//	@GetMapping("/products")
	@GetMapping
	public List<Product> showAllProducts()
	{
		return productService.getAllProducts();
	}

//	@PostMapping("/products")
	@PostMapping
	public Product createProduct(@RequestBody Product product)
	{
		return productService.createProduct(product);
	}
	
//	@GetMapping("/products/{ProductId}")
	@GetMapping("/{ProductId}")
	public Product showProduct(@PathVariable String ProductId )
	{
		return productService.getById(Integer.parseInt(ProductId));
	}
	
//	@DeleteMapping("/products/{ProductId}")
	@DeleteMapping("/{ProductId}")
	public void deleteProduct(@PathVariable String ProductId )
	{
		 productService.deleteProduct(Integer.parseInt(ProductId));
		 System.out.println("Product deleted successfully!");
	}
	
//	@PutMapping("/products")
	@PutMapping
	public Product updateProduct(@RequestBody Product product)
	{
		return productService.createProduct(product);
	}
	
	//Handling Controller Specific Exceptions:
	
//	@ExceptionHandler(RuntimeException.class)
//	public String handleException(RuntimeException runtimeException)
//	{
//		System.out.println(runtimeException.getMessage());
//		return "errorWrittenByUs: "+runtimeException.getMessage();
//	}
	
//	@ExceptionHandler(RuntimeException.class)
//	public ResponseEntity<String> handleException(RuntimeException runtimeException)
//	{
//		System.out.println(runtimeException.getMessage());
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//					.body("errorWrittenByUs: "+runtimeException.getMessage());
//	}

}
