package com.Day1.emergencypatientnavigation;

public class UseAmbulanceRouteMian {
   
	public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.findAvailableUnit();

        route.removeUnit("Surgery"); 

        route.findAvailableUnit(); 
    }
}
