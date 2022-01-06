/**
 * 
 */
package com.arun.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.arun.springboot.model.Recipe;

/**
 * @author arun
 *
 */
@Service
public class RecipeService {

	private Map<Integer, Recipe> recipes = new HashMap<>();

	public RecipeService() {
		recipes.put(1, new Recipe("Chicken Biryani", "Non-Veg", ""));
		recipes.put(2, new Recipe("Rotti", "Veg", "Millet Bread"));
		recipes.put(3, new Recipe("Pasta", "Veg", "Penne"));
	}

	public List<Recipe> getRecipes() {

		return new ArrayList(recipes.keySet());
	}

	public Recipe getRecipeById(int id) {
		return recipes.get(id);
	}

}
