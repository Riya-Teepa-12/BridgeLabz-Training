package com.constructor.Level1;

public class Vehicle {

	    // Instance variables
	    private String ownerName;
	    private String vehicleType;

	    // Class variable 
	    private static double registrationFee = 5000.0;

	    // Constructor
	    public Vehicle(String ownerName, String vehicleType) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    // Instance method to display vehicle details
	    public void displayVehicleDetails() {
	        System.out.println("Owner Name       : " + ownerName);
	        System.out.println("Vehicle Type     : " + vehicleType);
	        System.out.println("Registration Fee : " + registrationFee);
	        System.out.println("--------------------------------");
	    }

	
	    public static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }

	 
	    public static void main(String[] args) {

	        Vehicle v1 = new Vehicle("Riya", "Car");
	        Vehicle v2 = new Vehicle("Harshit Mishra", "Bike");

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	        // Update registration fee for all vehicles
	        Vehicle.updateRegistrationFee(6000.0);

	        System.out.println("After updating registration fee:");

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();
	    }
	}



