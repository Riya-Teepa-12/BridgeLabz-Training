package com.day5.smartparkmanagement;

public class UseVehicle {
	
	 public static void main(String[] args) {

	        ParkingSlot slot1 = new ParkingSlot("A1", "Zone-1", "Car");
	        ParkingSlot slot2 = new ParkingSlot("B1", "Zone-2", "Bike");

	        Vehicle car = new Car("CAR-101");
	        Vehicle bike = new Bike("BIKE-202");

	        ParkingManager manager = new ParkingManager();

	        manager.parkVehicle(slot1, car, 6);
	        manager.parkVehicle(slot2, bike, 3);

	        System.out.println("\n--- Booking Logs ---");
	        manager.showLogs();
	    }

}
