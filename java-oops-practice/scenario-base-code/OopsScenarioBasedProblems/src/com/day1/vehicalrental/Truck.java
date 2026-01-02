package com.day1.vehicalrental;

public class Truck extends Vehicle {

    public Truck(String vehicleId, String brand) {
        super(vehicleId, brand, 1500);
    }

    
    public double calculateRent(int days) {
        double heavyLoadCharge = 500;
        return (baseRate * days) + heavyLoadCharge;
    }

}
