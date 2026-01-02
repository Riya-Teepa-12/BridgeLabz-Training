package com.day1.vehicalrental;

public class Bike extends Vehicle {

    public Bike(String vehicleId, String brand) {
        super(vehicleId, brand, 300);
    }

   
    public double calculateRent(int days) {
        return baseRate * days;
    }

}
