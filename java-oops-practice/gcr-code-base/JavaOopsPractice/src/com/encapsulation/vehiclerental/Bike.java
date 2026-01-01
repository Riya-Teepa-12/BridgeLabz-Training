package com.encapsulation.vehiclerental;

public class Bike extends Vehicle implements Insurable{
    
	 private String insurancePolicyNumber;

	    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
	        super(vehicleNumber, "Bike", rentalRate);
	        this.insurancePolicyNumber = policyNumber;
	    }

	    
	    public double calculateRentalCost(int days) {
	        return rentalRate * days;
	    }

	   
	    public double calculateInsurance(int days) {
	        return 100 * days;
	    }

	    
	    public String getInsuranceDetails() {
	        return "Bike Insurance Policy: " + insurancePolicyNumber;
	    }

}
