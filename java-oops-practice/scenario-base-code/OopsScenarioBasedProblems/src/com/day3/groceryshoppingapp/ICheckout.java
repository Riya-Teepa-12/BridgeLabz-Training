package com.day3.groceryshoppingapp;

public interface ICheckout {
	void generateBill();
    void applyDiscount(double couponAmount);
}
