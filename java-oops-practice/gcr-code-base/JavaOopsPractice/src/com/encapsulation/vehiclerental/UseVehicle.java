package com.encapsulation.vehiclerental;

import java.util.*;

public class UseVehicle {
	public static void main(String []args) {
		
		  List<Vehicle> vehicles = new ArrayList<>();

	        vehicles.add(new Car("CAR101", 1500, "CAR-INS-001"));
	        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-002"));
	        vehicles.add(new Truck("TRK303", "Truck",3000, "TRUCK-INS-003"));

	        int days = 3;

	        for (Vehicle vehicle : vehicles) {
	            vehicle.displayDetails();

	            System.out.println("Rental Cost : ₹" + vehicle.calculateRentalCost(days));

	            // Polymorphism with interface
	            if (vehicle instanceof Insurable) {
	                Insurable insurable = (Insurable) vehicle;
	                System.out.println("Insurance   : ₹" + insurable.calculateInsurance(days));
	                System.out.println(insurable.getInsuranceDetails());
	            }

	            System.out.println("-----------------------------");
	        }
	    }

}
