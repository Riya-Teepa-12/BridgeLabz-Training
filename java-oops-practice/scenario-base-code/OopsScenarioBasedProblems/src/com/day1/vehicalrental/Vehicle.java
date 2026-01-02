package com.day1.vehicalrental;

public abstract class Vehicle implements Rentable {
    protected String vehicleId;
    protected String brand;
    protected double baseRate;

    public Vehicle(String vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getVehicleDetails() {
        return vehicleId + " - " + brand;
    }
     
}
