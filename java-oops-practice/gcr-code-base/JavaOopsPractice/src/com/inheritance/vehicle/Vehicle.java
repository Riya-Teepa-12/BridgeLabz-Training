package com.inheritance.vehicle;

public class Vehicle{
    
	private double maxSpeed;
	private String fuelType;
	public Vehicle(double maxSpeed, String fuelType) {
		
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void displayInfo() {
		System.out.println("Maximum Speed :"+maxSpeed);
		System.out.println("Fuel Type :"+fuelType);
		
	}
	
	
}
