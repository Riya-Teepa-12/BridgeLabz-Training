package com.collectionsGenerics.personalizedmealgenerator;

public class Vegetarian implements MealPlan {
    public String getMealName() {
        return "Vegetarian Meal";
    }

    public int getCalories() {
        return 500;
    }

}
