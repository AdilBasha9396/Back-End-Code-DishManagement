package com.jpa.test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DishEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dishId;
	private String dishName;
	private String imageUrl;
	private boolean isPublished;
	public DishEntity(int dishId, String dishName, String imageUrl, boolean isPublished) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.imageUrl = imageUrl;
		this.isPublished = isPublished;
	}
	public DishEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isPublished() {
		return isPublished;
	}
	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}
	@Override
	public String toString() {
		return "DishEntity [dishId=" + dishId + ", dishName=" + dishName + ", imageUrl=" + imageUrl + ", isPublished="
				+ isPublished + "]";
	}
	
	
	
	

}
