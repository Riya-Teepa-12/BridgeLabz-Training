package com.day5.digitalbookstoresystem;

public class PrintedBook  extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    
    public double applyDiscount(double price) {
        return price * 0.95; // 5% discount
    }

}
