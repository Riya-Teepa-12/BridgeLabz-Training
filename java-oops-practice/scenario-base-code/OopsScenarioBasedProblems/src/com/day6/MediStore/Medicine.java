package com.day6.MediStore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {
    private String name;
    private double price;
    private int quantity;
    protected LocalDate expiryDate;

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Sell medicine
    public double sell(int units) {
        if (units > quantity || checkExpiry()) {
            System.out.println("Sale not allowed.");
            return 0;
        }
        quantity -= units;
        return calculateFinalPrice(units);
    }

    // Sensitive pricing logic
    private double calculateFinalPrice(int units) {
        double total = units * price;          // operator usage
        if (units >= 5) {
            total -= total * 0.10;              // discount operator
        }
        return total;
    }

    protected int getQuantity() {
        return quantity;
    }
}

/* Tablet - preserved medicine */
class Tablet extends Medicine {
    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    // Preserved meds expire only after date passes
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
