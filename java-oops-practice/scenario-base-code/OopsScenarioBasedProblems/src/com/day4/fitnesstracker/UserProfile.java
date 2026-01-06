package com.day4.fitnesstracker;

public class UserProfile {
	private String name;
    private int age;
    private double weight; // private health data
    private int dailyCalorieTarget;
    private double caloriesBurnedToday;

    // Constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, int dailyCalorieTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieTarget = dailyCalorieTarget;
    }

    // Controlled access to sensitive data
    public double getWeight() {
        return weight;
    }

    public void updateWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    // Operator-like calculation (target - burned)
    public double calculateProgress() {
        return dailyCalorieTarget - caloriesBurnedToday;
    }

    // (polymorphism)
    public void addWorkout(Workout workout) {
        caloriesBurnedToday += workout.getCaloriesBurned();
    }

    public void showDailySummary() {
        System.out.println("User: " + name);
        System.out.println("Calories Burned: " + caloriesBurnedToday);
        System.out.println("Remaining Target: " + calculateProgress());
    }
}
