package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Food;
import com.nt.service.IFoodService;

@RestController
public class FoodOperationsController {

	@Autowired
	private IFoodService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveFooditems(@RequestBody Food food){
		String msg=service.registerFood(food);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Food>> showFooditems(){
		List<Food> food =service.showAllFoods();
		return new ResponseEntity<List<Food>>(food,HttpStatus.CREATED);
	}
	
}
