package com.day6.travelitineraryplanner;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Domestic Trip booked to " + destination);
        System.out.println("No passport required.");
        System.out.println("Total Budget: ₹" + budget);
    }

}
