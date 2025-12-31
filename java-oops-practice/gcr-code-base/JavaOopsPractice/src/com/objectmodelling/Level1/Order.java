package com.objectmodelling.Level1;

import java.util.*;
public class Order {
	 private int orderId;
	    private List<Product> products;

	    public Order(int orderId) {
	        this.orderId = orderId;
	        this.products = new ArrayList<>();
	    }

	    public void addProduct(Product product) {
	        products.add(product);
	        System.out.println("Product added to Order " + orderId);
	    }

	    public void showOrderDetails() {
	        System.out.println("\nOrder ID: " + orderId);
	        double total = 0;

	        for (Product p : products) {
	            p.displayProduct();
	            total += p.getPrice();
	        }

	        System.out.println("Total Amount: ₹" + total);
	    }
}
