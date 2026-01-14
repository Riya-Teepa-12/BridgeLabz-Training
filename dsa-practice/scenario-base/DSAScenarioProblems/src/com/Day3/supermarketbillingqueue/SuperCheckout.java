package com.Day3.supermarketbillingqueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SuperCheckout {
    
     static Queue<Customer> checkoutQueue = new LinkedList<>();

	    static HashMap<String, Integer> priceMap = new HashMap<>();
	    static HashMap<String, Integer> stockMap = new HashMap<>();

	    // Add customer to queue
	    public static void addCustomer(Customer customer) {
	        checkoutQueue.add(customer);
	        System.out.println(customer.name + " joined the billing queue.");
	    }

	    // Process billing
	    public static void processCustomer() {
	        if (checkoutQueue.isEmpty()) {
	            System.out.println("No customers in queue.");
	            return;
	        }

	        Customer customer = checkoutQueue.poll();
	        int totalBill = 0;

	        System.out.println("\nBilling Customer: " + customer.name);

	        for (String item : customer.items.keySet()) {
	            int quantity = customer.items.get(item);

	            if (!stockMap.containsKey(item) || stockMap.get(item) < quantity) {
	                System.out.println("Insufficient stock for " + item);
	                continue;
	            }

	            int price = priceMap.get(item);
	            totalBill += price * quantity;

	            // Update stock
	            stockMap.put(item, stockMap.get(item) - quantity);
	        }

	        System.out.println("Total Bill Amount: ₹" + totalBill);
	    }
	          
	 
	
       
	
}
