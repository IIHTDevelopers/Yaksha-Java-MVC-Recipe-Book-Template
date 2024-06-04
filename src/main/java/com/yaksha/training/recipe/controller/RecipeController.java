package com.yaksha.training.recipe.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.recipe.entity.Recipe;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/recipe", "/" })
public class RecipeController {

	@GetMapping(value = { "/list", "/" })
	public String listRecipes(@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/addRecipeForm")
	public String showFormForAdd(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveRecipe")
	public String saveRecipe(@Valid @ModelAttribute("recipe") Recipe recipe, BindingResult bindingResult) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateRecipeForm")
	public String showFormForUpdate(@RequestParam("recipeId") Long id, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete")
	public String deleteRecipe(@RequestParam("recipeId") Long id) {
		// write your logic here
		return "";
	}

	@RequestMapping("/search")
	public String searchRecipes(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateStatus")
	public String updateStatus(@RequestParam("id") Long id, @RequestParam("status") String status) {
		// write your logic here
		return "";
	}
}
