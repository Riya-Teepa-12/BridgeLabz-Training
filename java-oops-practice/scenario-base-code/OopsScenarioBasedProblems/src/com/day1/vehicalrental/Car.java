package com.day1.vehicalrental;

public class Car extends Vehicle {

    public Car(String vehicleId, String brand) {
        super(vehicleId, brand, 800);
    }

   
    public double calculateRent(int days) {
        double insurance = 200;
        return (baseRate * days) + insurance;
    }

}
