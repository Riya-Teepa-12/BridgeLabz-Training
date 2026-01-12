package com.Day2.trafficmanager;

public class UseTrafficManager {
	
	// Main method for testing
    public static void main(String[] args) {
        TrafficManager tm = new TrafficManager();

        tm.addToQueue("CAR-596");
        tm.addToQueue("CAR-597");
        tm.addToQueue("CAR-598");

        tm.enterRoundabout();
        tm.enterRoundabout();

        tm.printRoundabout();

        tm.exitRoundabout("CAR-596");
        tm.printRoundabout();

        tm.enterRoundabout();
        tm.printRoundabout();
    }

}
