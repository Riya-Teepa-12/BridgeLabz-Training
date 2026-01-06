package com.day4.fitnesstracker;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
        this.caloriesBurned = calculateCalories();
    }


    public double calculateCalories() {
        return duration * 8.5; 
    }

}
