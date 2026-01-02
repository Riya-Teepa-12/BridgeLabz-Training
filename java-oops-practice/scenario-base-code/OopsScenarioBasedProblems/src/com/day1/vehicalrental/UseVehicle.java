package com.day1.vehicalrental;

public class UseVehicle {
	 public static void main(String[] args) {

	        Vehicle bike = new Bike("B101", "Yamaha");
	        Vehicle car = new Car("C202", "Honda");
	        Vehicle truck = new Truck("T303", "Tata");

	        int days = 3;

	        System.out.println(bike.getVehicleDetails() + " Rent: ₹" + bike.calculateRent(days));
	        System.out.println(car.getVehicleDetails() + " Rent: ₹" + car.calculateRent(days));
	        System.out.println(truck.getVehicleDetails() + " Rent: ₹" + truck.calculateRent(days));
	    }

}
