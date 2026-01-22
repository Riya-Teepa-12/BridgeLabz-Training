package com.day5.smartparkmanagement;

public class Truck  extends Vehicle {

    public Truck(String number) {
        super(number, 100);
    }

    
    public double calculateCharges(int hours) {
        double penalty = hours > 4 ? 200 : 0;
        return (baseRate * hours) + penalty;
    }

}