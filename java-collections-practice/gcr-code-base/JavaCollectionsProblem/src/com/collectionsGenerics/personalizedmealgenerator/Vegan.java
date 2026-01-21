package com.collectionsGenerics.personalizedmealgenerator;

public class Vegan implements MealPlan {
    public String getMealName() {
        return "Vegan Meal";
    }

    public int getCalories() {
        return 450;
    }

}
