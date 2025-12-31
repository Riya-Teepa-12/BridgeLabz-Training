package com.objectmodelling.Level1;

public class CustomerDemo {
	 private int customerId;
	    private String customerName;

	    public CustomerDemo(int customerId, String customerName) {
	        this.customerId = customerId;
	        this.customerName = customerName;
	    }

	    public void placeOrder(Order order) {
	        System.out.println("\nCustomer " + customerName + " placed Order " + order);
	    }
}
