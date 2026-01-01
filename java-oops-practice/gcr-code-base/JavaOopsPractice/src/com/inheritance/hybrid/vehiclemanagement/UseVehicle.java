package com.inheritance.hybrid.vehiclemanagement;

public class UseVehicle {
	 public static void main(String[] args) {

	        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225);
	        PetrolVehicle pv = new PetrolVehicle("Honda City", 190);

	        ev.displayDetails();
	        ev.charge();

	        System.out.println();

	        pv.displayDetails();
	        pv.refuel();
	    }

}
