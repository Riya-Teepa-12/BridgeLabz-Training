package com.day9.payexpress;


import java.util.ArrayList;

public class PayXpressSystem {
	
	 private ArrayList<Bill> bills = new ArrayList<>();

	    public void addBill(Bill bill) {
	        bills.add(bill);
	    }

	    public void displayAllBills() {
	        for (Bill bill : bills) {
	            bill.displayBill();
	        }
	    }

	    public void sendAllReminders() {
	        for (Bill bill : bills) {
	            if (bill instanceof IPayable && !bill.isPaid()) {
	                ((IPayable) bill).sendReminder();
	            }
	        }
	    }

	    public void payAllBills() {
	        for (Bill bill : bills) {
	            if (bill instanceof IPayable && !bill.isPaid()) {
	                ((IPayable) bill).pay();
	            }
	        }
	    }

}
