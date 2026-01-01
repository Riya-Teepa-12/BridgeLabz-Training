package com.encapsulation.vehiclerental;

public class Car extends Vehicle implements Insurable{
 
	  private String insurancePolicyNumber;

	    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
	        super(vehicleNumber, "Car", rentalRate);
	        this.insurancePolicyNumber = policyNumber;
	    }

	    
	    public double calculateRentalCost(int days) {
	        return rentalRate * days;
	    }

	    
	    public double calculateInsurance(int days) {
	        return 200 * days;
	    }

	    
	    public String getInsuranceDetails() {
	        return "Car Insurance Policy: " + insurancePolicyNumber;
	    }
}
