package com.day5.digitalbookstoresystem;

import java.util.*;

public class Order {
    
	  private String orderId;
	    private String userName;
	    private Map<Book, Integer> items = new HashMap<>();
	    private String status;

	    public Order(String userName) {
	        this.userName = userName;
	        this.orderId = UUID.randomUUID().toString();
	        this.status = "CREATED";
	    }

	    public void addBook(Book book, int quantity) {
	        if (book.reduceStock(quantity)) {
	            items.put(book, quantity);
	        } else {
	            System.out.println("Not enough stock for " + book.title);
	        }
	    }

	    // Operator usage: price × quantity – discount
	    public double calculateTotal() {
	        double total = 0;

	        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
	            Book book = entry.getKey();
	            int qty = entry.getValue();
	            double cost = book.price * qty;
	            cost = book.applyDiscount(cost);
	            total += cost;
	        }
	        return total;
	    }

	    // Restricted access
	    protected void updateStatus(String newStatus) {
	        this.status = newStatus;
	    }

	    public String getStatus() {
	        return status;
	    }
}
