package com.day7.restaurantorderingsystem;

public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }


    public void showItem() {
        System.out.println("Non-Veg Item: " + name + " | Price: " + price);
    }

}
