package com.collectors.orderrevenuesummary;

public class Order {
	 String customerName;
	    double amount;

	    Order(String customerName, double amount) {
	        this.customerName = customerName;
	        this.amount = amount;
	    }

	    String getCustomerName() {
	        return customerName;
	    }

	    double getAmount() {
	        return amount;
	    }
}
