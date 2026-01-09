package com.day7.restaurantorderingsystem;

public class UseFoodItem {
	
	public static void main(String[] args) {

        FoodItem pizza = new VegItem("Veg Pizza", 300, 5);
        FoodItem burger = new VegItem("Veg Burger", 150, 10);
        FoodItem biryani = new NonVegItem("Chicken Biryani", 400, 7);

        pizza.showItem();
        burger.showItem();
        biryani.showItem();

        System.out.println();

        Order order = new Order();
        order.addItem(pizza);
        order.addItem(burger);
        order.addItem(biryani);

        order.placeOrder();
    }

}
