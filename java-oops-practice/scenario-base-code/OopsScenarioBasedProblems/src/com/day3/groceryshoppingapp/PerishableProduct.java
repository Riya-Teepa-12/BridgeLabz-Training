package com.day3.groceryshoppingapp;

public class PerishableProduct extends Product{

	    public PerishableProduct(String name, double price, String category, int quantity) {
	        super(name, price, category, quantity);
	    }

	  
	    public double applyDiscount() {
	        return getTotalPrice() * 0.10;
	    }
}
