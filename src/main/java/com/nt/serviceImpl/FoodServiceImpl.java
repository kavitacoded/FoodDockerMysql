package com.nt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Food;
import com.nt.repo.IFoodRepository;
import com.nt.service.IFoodService;

@Service
public class FoodServiceImpl  implements IFoodService{

	@Autowired
	private IFoodRepository repo;
	
	@Override
	public String registerFood(Food food) {
		return repo.save(food)+" Food is Saved";
	}

	@Override
	public List<Food> showAllFoods() {
		return repo.findAll();
	}

}
