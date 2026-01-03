package com.day2.ridehailing;

public class RideService implements IRideService {

    private double fare;
    private boolean rideActive;

   
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {
        double baseFare = 50;
        fare = baseFare + (distance * vehicle.getRatePerKm());
        rideActive = true;

        System.out.println("\nRide Booked Successfully!");
        System.out.println("Driver Name: " + driver.getName());
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + fare);
    }

   
    public void endRide() {
        if (rideActive) {
            rideActive = false;
            System.out.println("\nRide Ended. Thanks for choosing CabbyGo!");
        } else {
            System.out.println("\nNo active ride found.");
        }
    }

    public double getFare() {
        return fare;
    }

}
