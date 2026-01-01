package com.inheritance.vehicle;

public class Car extends Vehicle{
	private double seatCapacity;
   Car(double maxSpeed, String fuelType,double seatCapacity) {
	   super(maxSpeed,fuelType);
	   this.seatCapacity = seatCapacity;
   }
   
   public void displayInfo() {
	   super.displayInfo();
	   System.out.println("The seat capacity is"+seatCapacity);
   }
}
