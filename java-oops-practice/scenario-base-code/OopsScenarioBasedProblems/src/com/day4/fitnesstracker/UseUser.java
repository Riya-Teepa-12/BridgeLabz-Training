package com.day4.fitnesstracker;

public class UseUser {
	 public static void main(String[] args) {

	        UserProfile user = new UserProfile("Prince", 22, 70.5, 2500);

	        Workout cardio = new CardioWorkout(30);
	        Workout strength = new StrengthWorkout(40);

	        cardio.startWorkout();
	        user.addWorkout(cardio);
	        cardio.stopWorkout();

	        strength.startWorkout();
	        user.addWorkout(strength);
	        strength.stopWorkout();

	        user.showDailySummary();
	    }
}
