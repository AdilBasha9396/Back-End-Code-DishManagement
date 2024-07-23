package com.jpa.test.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpa.test.Entity.DishEntity;
import com.jpa.test.Repository.Dishrepository;

@Service
public class DishServiceImplementation implements DishService{
	
    @Autowired
    private Dishrepository dishRepository; 

	@Override
	public List<DishEntity> getAllDishes() {
		List<DishEntity> dish = dishRepository.findAll();
		return dish;
	}


	@Override
	public DishEntity toggleDishStatus( int id ) {
        DishEntity dish = dishRepository.findById(id).orElseThrow(() -> new RuntimeException("Dish not found"));
        dish.setPublished(!dish.isPublished());
        return dishRepository.save(dish);
	}


	@Override
	public DishEntity addDish(DishEntity dishEntity) {
		return dishRepository.save(dishEntity);
	}
   
	
	

}
