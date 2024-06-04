package com.yaksha.training.recipe.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.recipe.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

	// feel free to update this
	List<Recipe> findByTitle(@Param("keyword") String keyword);

	// feel free to update this
	Page<Recipe> findAllRecipe(Pageable pageable);

	// feel free to update this
	Page<Recipe> findByRecipeByTitleOrDesc(@Param("keyword") String keyword, Pageable pageable);

	// feel free to update this
	void updateRecipeStatus(@Param("id") Long id, @Param("status") String status);

}
