package com.day4.fitnesstracker;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
        this.caloriesBurned = calculateCalories();
    }

   
    public double calculateCalories() {
        return duration * 6.0;
    }

}
