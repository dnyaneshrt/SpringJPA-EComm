package com.learn.Spring_Data_JPA.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //will create table for this Object
@Table(name="JPA_Product")
public class Product {
	
@Id	
//@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Product_Id")
private int id;

@Column(name="Product_Title", unique = true, nullable = false, length = 200)
private String title;

private double price;

private String description;

private boolean isLive;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

@Override
public String toString() {
	return "Product [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description + ", isLive="
			+ isLive + "]";
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public boolean isLive() {
	return isLive;
}

public void setLive(boolean isLive) {
	this.isLive = isLive;
}


public Product(int id, String title, double price, String description, boolean isLive) {
	super();
	this.id = id;
	this.title = title;
	this.price = price;
	this.description = description;
	this.isLive = isLive;
}

public Product() {
	super();
}
}
