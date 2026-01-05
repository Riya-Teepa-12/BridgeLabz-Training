package com.day3.groceryshoppingapp;

import java.util.*;

public class Cart{
	
	private List<Product> products;
    private double totalPrice;

    // Constructor without pre-selected items
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update prices
    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    // Encapsulation: total calculation hidden
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

 
    public void generateBill() {
        double totalDiscount = 0;

        System.out.println("----- SwiftCart Bill -----");
        for (Product p : products) {
            System.out.println(p.getName() + " : ₹" + p.getTotalPrice());
            totalDiscount += p.applyDiscount(); // Polymorphism
        }

        totalPrice -= totalDiscount;
        System.out.println("Discount Applied: ₹" + totalDiscount);
        System.out.println("Final Amount: ₹" + totalPrice);
    }

   
    public void applyDiscount(double couponAmount) {
        totalPrice -= couponAmount;
        System.out.println("Coupon Discount: ₹" + couponAmount);
        System.out.println("Amount Payable: ₹" + totalPrice);
    }
    
}
