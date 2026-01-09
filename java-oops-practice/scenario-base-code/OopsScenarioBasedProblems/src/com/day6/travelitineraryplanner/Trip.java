package com.day6.travelitineraryplanner;

public class Trip implements IBookable {
    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor to generate complete trip package
    public Trip(String destination, int duration, Transport transport,
                Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Operator usage to calculate total budget
        this.budget = transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }

   
    public void book() {
        System.out.println("Booking a general trip to " + destination);
    }

  
    public void cancel() {
        System.out.println("Trip to " + destination + " has been cancelled.");
    }
	 
	

	
	
}
