/**
 * 
 */
package com.arun.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.springboot.model.Recipe;
import com.arun.springboot.service.RecipeService;

/**
 * @author arun
 *
 */
@RestController
public class FoodController {

	@Autowired
	private RecipeService recipeService;

	@RequestMapping("/ping")
	public String ping() {
		return "Success :)";
	}

	@RequestMapping("/recipes")
	public List<Recipe> getRecipes() {
		return recipeService.getRecipes();
	}

	@RequestMapping("/recipes/{id}")
	public Recipe getRecipe(@PathVariable int id) {
		return recipeService.getRecipeById(id);
	}
}
