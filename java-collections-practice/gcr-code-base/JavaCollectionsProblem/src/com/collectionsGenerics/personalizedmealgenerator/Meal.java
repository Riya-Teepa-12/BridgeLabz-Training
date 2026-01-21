package com.collectionsGenerics.personalizedmealgenerator;

public class Meal<T extends MealPlan> {
       
	private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void displayMeal() {
        System.out.println("Meal Type : " + mealPlan.getMealName());
        System.out.println("Calories  : " + mealPlan.getCalories());
    }
}
