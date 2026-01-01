package com.inheritance.vehicle;

public class MotorCycle extends Vehicle {
       
	private int maxSeat;
	MotorCycle(double maxSpeed, String fuelType,int maxSeat) {
         super(maxSpeed,fuelType);
         this.maxSeat = maxSeat;
    }
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The maximum number of seat is "+maxSeat);
	}
}
