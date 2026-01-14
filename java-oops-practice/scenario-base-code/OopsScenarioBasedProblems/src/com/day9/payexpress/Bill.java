package com.day9.payexpress;

import java.time.LocalDate;

public abstract class Bill {
	
	 private String type;
	    private double amount;
	    private LocalDate dueDate;
	    private boolean isPaid;

	    // Constructor for recurring bills
	    public Bill(String type, double amount, LocalDate dueDate) {
	        this.type = type;
	        this.amount = amount;
	        this.dueDate = dueDate;
	        this.isPaid = false;
	    }

	    // Protected access for subclasses only
	    protected double getAmount() {
	        return amount;
	    }

	    protected LocalDate getDueDate() {
	        return dueDate;
	    }

	    public String getType() {
	        return type;
	    }

	    public boolean isPaid() {
	        return isPaid;
	    }

	    // Encapsulation: status cannot be changed directly
	    protected void markAsPaid() {
	        this.isPaid = true;
	    }

	    // Late fee calculation using operators
	    protected double calculateLateFee() {
	        double penalty = 50.0;
	        return amount + penalty;
	    }

	    public abstract void displayBill();

}
