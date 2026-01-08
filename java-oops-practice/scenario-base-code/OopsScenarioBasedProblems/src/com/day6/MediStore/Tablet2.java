package com.day6.MediStore;

import java.time.LocalDate;

public class Tablet2  extends Medicine {
	
    public Tablet2(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    // Liquid meds expire 30 days before expiry date
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate.minusDays(30));
    }
}
