package com.day5.smartparkmanagement;

public abstract class Vehicle implements Ipayable {
    protected String vehicleNumber;
    protected double baseRate;

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

}
