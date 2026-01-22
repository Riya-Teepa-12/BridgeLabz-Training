package com.day5.smartparkmanagement;

public class Bike  extends Vehicle {

    public Bike(String number) {
        super(number, 20);
    }

   
    public double calculateCharges(int hours) {
        double penalty = hours > 6 ? 50 : 0;
        return (baseRate * hours) + penalty;
    }

}