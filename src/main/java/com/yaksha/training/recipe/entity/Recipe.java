package com.yaksha.training.recipe.entity;

public class Recipe {

	private Long id;

	private String title;

	private String description;

	private String ingredients;

	private Integer cookTime;

	public Recipe() {
	}

	public Recipe(Long id, String title, String description, String ingredients, Integer cookTime) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.ingredients = ingredients;
		this.cookTime = cookTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public Integer getCookTime() {
		return cookTime;
	}

	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}

	@Override
	public String toString() {
		return "Recipe{" + "id=" + id + ", title='" + title + '\'' + ", description='" + description + '\''
				+ ", ingredients='" + ingredients + '\'' + ", cookTime='" + cookTime + '\'' + '}';
	}
}
