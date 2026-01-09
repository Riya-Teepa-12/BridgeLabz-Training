package com.day6.travelitineraryplanner;

public class InternationalTrip  extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International Trip booked to " + destination);
        System.out.println("Passport & Visa required.");
        System.out.println("Total Budget: ₹" + budget);
    }

}
