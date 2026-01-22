package com.day5.smartparkmanagement;

public class Car extends Vehicle {

    public Car(String number) {
        super(number, 50);
    }

 
    public double calculateCharges(int hours) {
        double penalty = hours > 5 ? 100 : 0;
        return (baseRate * hours) + penalty;
    }

}