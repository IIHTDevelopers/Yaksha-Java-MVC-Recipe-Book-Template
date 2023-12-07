package com.yaksha.training.recipe.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.recipe.entity.Recipe;

@Controller
@RequestMapping(value = { "/recipe", "/" })
public class RecipeController {

	@GetMapping(value = { "/list", "/" })
	public String listRecipes(Model model) {
		return "";
	}

	@GetMapping("/addRecipeForm")
	public String showFormForAdd(Model model) {
		return "";
	}

	@PostMapping("/saveRecipe")
	public String saveRecipe(@Valid @ModelAttribute("recipe") Recipe recipe, BindingResult bindingResult) {
		return "";
	}

	@GetMapping("/updateRecipeForm")
	public String showFormForUpdate(@RequestParam("recipeId") Long id, Model model) {
		return "";
	}

	@GetMapping("/delete")
	public String deleteRecipe(@RequestParam("recipeId") Long id) {
		return "";
	}

	@PostMapping("/search")
	public String searchRecipes(@RequestParam("theSearchName") String theSearchName, Model theModel) {
		return "";
	}
}
