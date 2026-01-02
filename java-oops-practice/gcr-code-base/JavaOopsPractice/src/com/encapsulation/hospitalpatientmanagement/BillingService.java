package com.encapsulation.hospitalpatientmanagement;

public class BillingService {
      
	 public static void generateBill(Patient patient) {
	        patient.getPatientDetails();
	        System.out.println("Total Bill : ₹" + patient.calculateBill());
	        System.out.println("--------------------------------");
	    }
}
