package com.collectionsGenerics.personalizedmealgenerator;

public class UseMeal {
	public static void main(String[] args) {

        Meal<Vegetarian> vegMeal =
                new Meal<>(new Vegetarian());
        vegMeal.displayMeal();

        Meal<Vegan> veganMeal =
                new Meal<>(new Vegan());
        veganMeal.displayMeal();

        Meal<Keto> ketoMeal =
                new Meal<>(new Keto());
        ketoMeal.displayMeal();

        Meal<HighProtein> proteinMeal =
                new Meal<>(new HighProtein());
        proteinMeal.displayMeal();

        // Generic Method Usage
        MealGenerator.generateMeal(new Vegetarian());
        MealGenerator.generateMeal(new Keto());
    }
}
