package com.inheritance.hybrid.vehiclemanagement;

public class Vehicle {
      
	    private String model;
	    private int maxSpeed;

	    Vehicle(String model, int maxSpeed) {
	        this.model = model;
	        this.maxSpeed = maxSpeed;
	    }

	    void displayDetails() {
	        System.out.println("Model: " + model);
	        System.out.println("Max Speed: " + maxSpeed + " km/h");
	    }
}
