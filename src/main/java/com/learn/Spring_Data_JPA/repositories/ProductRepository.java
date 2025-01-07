package com.learn.Spring_Data_JPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learn.Spring_Data_JPA.entities.Product;


//not manadatory to use
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	
//	@Query(nativeQuery = true, value = "select * from jpa_product order by price")
//	List<Product> findAllProductsByOrderByPrice();
	
	List<Product> findProductsByOrderByPrice();

	List<Product> findProductsByOrderByDescription();
	
	List<Product> findProductsByDescriptionContaining(String keyword);
	
}
