package com.functionalinterfaces.smartvehicledashboard;

public class Car implements Vehicle {
	@Override
    public void displaySpeed() {
        System.out.println("Car speed is 80 km/h");
    }

}
