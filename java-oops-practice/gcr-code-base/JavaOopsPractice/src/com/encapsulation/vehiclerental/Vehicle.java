package com.encapsulation.vehiclerental;

public abstract class Vehicle {
      
	 private String vehicleNumber;
	    private String type;
	    protected double rentalRate;   // protected so subclasses can use it

	    public Vehicle(String vehicleNumber, String type, double rentalRate) {
	        this.vehicleNumber = vehicleNumber;
	        this.type = type;
	        this.rentalRate = rentalRate;
	    }

	    public String getVehicleNumber() {
	        return vehicleNumber;
	    }

	    public String getType() {
	        return type;
	    }

	    // Abstract method
	    public abstract double calculateRentalCost(int days);

	    public void displayDetails() {
	        System.out.println("Vehicle Number : " + vehicleNumber);
	        System.out.println("Vehicle Type   : " + type);
	    }
	
	
}
