package com.day1.hospitalmanagement;

public class UsePatient {
	
	 public static void main(String[] args) {

	        Patient p1 = new InPatient(101, "Rahul", 35, 5);
	        Patient p2 = new OutPatient(102, "Anita", 28, "02-Jan-2026");

	        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

	        Bill bill = new Bill(500, 1500, 10, 5);

	        p1.displayInfo();
	        p2.displayInfo();
	        d1.displayInfo();

	        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
	    }

}
