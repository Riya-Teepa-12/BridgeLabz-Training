package com.encapsulation.ridehailingapplication;

public abstract class Vehicle {
       
	private int vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation: getters only
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID  : " + vehicleId);
        System.out.println("Driver Name : " + driverName);
        System.out.println("Rate/Km     : ₹" + ratePerKm);
    }
}
