package com.nt.service;

import java.util.List;

import com.nt.entity.Food;

public interface IFoodService {

	public String registerFood(Food food);
	public List<Food> showAllFoods();
}
