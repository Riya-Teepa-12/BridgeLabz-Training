package com.functionalinterfaces.smartvehicledashboard;

public class ElectricCar implements Vehicle {
	@Override
    public void displaySpeed() {
        System.out.println("Electric car speed is 100 km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery percentage is 75 percent");
    }

}
