package com.jpa.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.jpa.test.Entity.DishEntity;
import com.jpa.test.Service.DishService;

@RestController
@RequestMapping("/api/dishes")
public class Controller {
    @Autowired
    
    private DishService dishService;
    
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @GetMapping
    public List<DishEntity> getAllDishes() {
        return dishService.getAllDishes();
    }

    @PostMapping("/{id}/toggle")
    public DishEntity toggleDishStatus(@PathVariable int id) {
        return dishService.toggleDishStatus(id);
    }
    
    // Handles POST requests to /api/dishes
    @PostMapping
    public DishEntity addDish(@RequestBody DishEntity dishEntity) {
        return dishService.addDish(dishEntity);
    }

	

}
