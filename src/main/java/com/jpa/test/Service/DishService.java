package com.jpa.test.Service;

import java.util.List;
import java.util.Optional;

import com.jpa.test.Entity.DishEntity;


public interface DishService {
	
	public List<DishEntity> getAllDishes();
	public DishEntity toggleDishStatus(int dishId);
	public DishEntity addDish(DishEntity dishEntity);

	
	
	

}
