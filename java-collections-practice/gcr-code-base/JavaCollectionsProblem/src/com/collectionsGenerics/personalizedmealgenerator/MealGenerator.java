package com.collectionsGenerics.personalizedmealgenerator;

public class MealGenerator {
	  public static <T extends MealPlan> void generateMeal(T mealPlan) {
	        System.out.println("Generating Personalized Meal Plan...");
	        System.out.println("Meal Selected : " + mealPlan.getMealName());
	        System.out.println("Total Calories: " + mealPlan.getCalories());
	        System.out.println("-------------------------------");
	    }
}
