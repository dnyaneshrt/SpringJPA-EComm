package com.learn.Spring_Data_JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.Spring_Data_JPA.entities.Product;


//not manadatory to use
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
