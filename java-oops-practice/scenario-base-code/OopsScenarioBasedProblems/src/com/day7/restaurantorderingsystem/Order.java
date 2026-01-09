package com.day7.restaurantorderingsystem;

import java.util.ArrayList;

public class Order implements IOrderable {

    private ArrayList<FoodItem> items;
    private double total;

    // Constructor for custom combo meals
    public Order() {
        items = new ArrayList<>();
        total = 0;
    }

    public void addItem(FoodItem item) {
        if (item.consumeStock()) {
            items.add(item);
            total += item.getPrice();
        }
    }

    // methods to discount varies by order total
    public double applyDiscount() {
        if (total >= 1000)
            return total * 0.20;
        else if (total >= 500)
            return total * 0.10;
        else
            return 0;
    }

   
    public void placeOrder() {
        double discount = applyDiscount();
        double finalAmount = total - discount;

        System.out.println("Order Placed");
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order Cancelled");
    }
}
