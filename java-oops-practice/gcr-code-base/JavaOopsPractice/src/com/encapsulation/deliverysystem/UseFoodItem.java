package com.encapsulation.deliverysystem;

public class UseFoodItem {
	 
	 public static void main(String[] args) {

	        FoodItem veg = new VegItem("Paneer Burger", 120, 2);
	        FoodItem nonVeg = new NonVegItem("Chicken Pizza", 300, 1);

	        OrderProcessor.processOrder(veg);
	        OrderProcessor.processOrder(nonVeg);
	    }
	

}
