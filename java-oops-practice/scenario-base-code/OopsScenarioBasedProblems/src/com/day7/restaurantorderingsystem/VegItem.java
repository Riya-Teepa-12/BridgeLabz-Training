package com.day7.restaurantorderingsystem;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    @Override
    public void showItem() {
        System.out.println("Veg Item: " + name + " | Price: " + price);
    }
}
