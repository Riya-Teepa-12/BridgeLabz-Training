package com.day3.groceryshoppingapp;

import java.util.*;

public class UseProduct {
	public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50, "Dairy", 2);
        Product rice = new NonPerishableProduct("Rice", 60, "Grains", 5);
        

        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(rice);

        cart.generateBill();
        cart.applyDiscount(50);
    }

}
