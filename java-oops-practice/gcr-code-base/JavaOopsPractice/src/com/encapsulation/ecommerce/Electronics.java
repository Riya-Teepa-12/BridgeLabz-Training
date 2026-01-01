package com.encapsulation.ecommerce;

public class Electronics extends Product implements Taxable{
	 private static final double TAX_RATE = 0.18;
	public Electronics(int productId , String name, double price) {
		super(productId , name, price);
	}
	
	
	 public double calculateDiscount() {
	        return getPrice() * 0.10; 
	    }
	 
	 public double calculateTax() {
	        return getPrice() * TAX_RATE;
	    }

	   
	   public String getTaxDetails() {
	        return "Electronics Tax: 18% GST";
	    }
	
       
}
