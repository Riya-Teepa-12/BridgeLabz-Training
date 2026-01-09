package com.day7.restaurantorderingsystem;

public abstract class FoodItem {
	 protected  String name;
	 protected String category;
	 protected double price;
	 protected boolean availability;
	 
	    private int stock;
	 public FoodItem(String name, String category, double price,int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock= stock;
		this.availability=stock>0;
	 }
	 

	  protected boolean consumeStock() {
	        if (stock > 0) {
	            stock--;
	            return true;
	        }
	        availability = false;
	        return false;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public abstract void showItem();
	 
}
