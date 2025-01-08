package com.learn.Spring_Data_JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.Spring_Data_JPA.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
