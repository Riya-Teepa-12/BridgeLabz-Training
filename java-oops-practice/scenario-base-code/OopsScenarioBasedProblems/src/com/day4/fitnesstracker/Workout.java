package com.day4.fitnesstracker;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // in minutes
    protected double caloriesBurned;

    protected Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

   // method
    public abstract double calculateCalories();

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

 
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

   
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }

}
