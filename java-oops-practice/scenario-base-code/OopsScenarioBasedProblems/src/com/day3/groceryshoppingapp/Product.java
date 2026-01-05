package com.day3.groceryshoppingapp;

public abstract class Product {
	
	 private String name;
	    private double price;
	    private String category;
	    private int quantity;

	    public Product(String name, double price, String category, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.category = category;
	        this.quantity = quantity;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	   
	    public double getTotalPrice() {
	        return price * quantity;
	    }
	
	    public abstract double applyDiscount();

}
