package com.learn.Spring_Data_JPA.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
	@Id	
	private int cat_id;
	
	private String title;

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getTitle() {
		return title;
	}

	public Category() {
		super();
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Category [cat_id=" + cat_id + ", title=" + title + "]";
	}
	

}
