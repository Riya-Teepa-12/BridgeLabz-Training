package com.encapsulation.vehiclerental;

public class Truck extends Vehicle implements Insurable{
	 private String insurancePolicyNumber;

	    public Truck(String vehicleNumber, String type,double rentalRate, String policyNumber) {
	        super(vehicleNumber, type, rentalRate);
	        this.insurancePolicyNumber = policyNumber;
	    }

	   
	    public double calculateRentalCost(int days) {
	        return (rentalRate * days) + 500; 
	    }

	   
	    public double calculateInsurance(int days) {
	        return 400 * days;
	    }

	   
	    public String getInsuranceDetails() {
	        return "Truck Insurance Policy: " + insurancePolicyNumber;
	    }

}
