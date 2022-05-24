package com.taco.data;

import org.springframework.data.repository.CrudRepository;

import com.taco.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
	

}
