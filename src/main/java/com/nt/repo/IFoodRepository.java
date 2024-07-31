package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Food;

public interface IFoodRepository extends JpaRepository<Food, Integer> {

}
