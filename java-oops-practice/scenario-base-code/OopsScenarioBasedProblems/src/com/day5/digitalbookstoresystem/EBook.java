package com.day5.digitalbookstoresystem;

public class EBook  extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE);
    }

   
    public double applyDiscount(double price) {
        return price * 0.85; // 15% discount
    }
}

