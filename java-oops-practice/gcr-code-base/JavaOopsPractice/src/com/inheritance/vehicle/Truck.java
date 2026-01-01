package com.inheritance.vehicle;

public class Truck extends Vehicle {
	private int prize;
	   Truck(double maxSpeed, String fuelType,int prize) {
         super(maxSpeed,fuelType);
         this.prize = prize;
    }
	
	 public void displayInfo() {
		 super.displayInfo();
		 System.out.println("The prize of the truck is"+prize);
	 }
}
