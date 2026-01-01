package com.encapsulation.ecommerce;

public class Groceries extends Product {
      
	public Groceries(int productId , String name, double price) {
		super(productId , name, price);
	}
	
	
	 public double calculateDiscount() {
	        return getPrice() * 0.15; 
	    }
	 
	
	   public String getTaxDetails() {
	        return "Electronics Tax: 5% GST";
	    }
}
