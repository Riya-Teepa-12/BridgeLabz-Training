package com.day6.MediStore;

import java.time.LocalDate;
public class Syrup extends Medicine {
    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    // Liquid meds expire 30 days before expiry date
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate.minusDays(30));
    }
}
