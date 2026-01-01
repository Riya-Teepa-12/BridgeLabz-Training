package com.encapsulation.ecommerce;

public class Clothing extends Product implements Taxable{
    
	private static final double TAX_RATE = 0.5;
	public Clothing(int productId , String name, double price) {
		super(productId , name, price);
	}
	
	
	 public double calculateDiscount() {
	        return getPrice() * 0.15; 
	    }
	 
	 public double calculateTax() {
	        return getPrice() * TAX_RATE;
	    }

	   
	   public String getTaxDetails() {
	        return "Electronics Tax: 5% GST";
	    }

}
