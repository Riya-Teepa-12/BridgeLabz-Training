package com.encapsulation.hospitalpatientmanagement;

public class UsePatient {
	
	 public static void main(String[] args) {

	        Patient p1 = new InPatient(101, "Rahul", 35, 5, 2000);
	        Patient p2 = new OutPatient(102, "Anita", 28, 500);

	        // Medical records
	        MedicalRecord m1 = (MedicalRecord) p1;
	        m1.addRecord("Fracture", "Admitted for observation");

	        MedicalRecord m2 = (MedicalRecord) p2;
	        m2.addRecord("pain in joint", "Prescribed medication");

	        // Billing
	        BillingService.generateBill(p1);
	        BillingService.generateBill(p2);

	        // View records
	        m1.viewRecords();
	        m2.viewRecords();
	    }

}
