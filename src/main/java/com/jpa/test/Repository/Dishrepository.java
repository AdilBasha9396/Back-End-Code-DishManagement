package com.jpa.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.Entity.DishEntity;

@Repository
public interface Dishrepository extends JpaRepository<DishEntity, Integer> {

}
