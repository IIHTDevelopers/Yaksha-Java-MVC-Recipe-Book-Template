package com.yaksha.training.recipe.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.recipe.entity.Recipe;

@Service
public class RecipeService {

	public Page<Recipe> getRecipes(Pageable pageable) {
		// write your logic here
		return null;
	}

	public Recipe saveRecipe(Recipe recipe) {
		// write your logic here
		return null;
	}

	public Recipe getRecipe(Long id) {
		// write your logic here
		return null;
	}

	public boolean deleteRecipe(Long id) {
		// write your logic here
		return false;
	}

	public Page<Recipe> searchRecipes(String theSearchName, Pageable pageable) {
		// write your logic here
		return null;
	}

	public boolean updateRecipeStatus(Long id, String status) {
		// write your logic here
		return false;
	}
}
