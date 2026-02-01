package com.functionalinterfaces.smartvehicledashboard;

public class UseVehicle {
	public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle electricCar = new ElectricCar();

        car.displaySpeed();
        car.displayBatteryPercentage();

        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
    }

}
