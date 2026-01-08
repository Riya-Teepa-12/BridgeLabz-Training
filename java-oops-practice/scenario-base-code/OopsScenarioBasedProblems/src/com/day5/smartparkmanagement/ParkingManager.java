package com.day5.smartparkmanagement;

import java.util.*;

public class ParkingManager {
  
	 private List<String> bookingLogs = new ArrayList<>(); // private records

	    public void parkVehicle(ParkingSlot slot, Vehicle vehicle, int hours) {
	        if (slot.bookSlot()) {
	            double charge = vehicle.calculateCharges(hours);
	            bookingLogs.add("Slot " + slot.getSlotId() +
	                    " booked for " + vehicle.vehicleNumber +
	                    " | Charge: ₹" + charge);
	            System.out.println("Vehicle parked. Charge: ₹" + charge);
	        } else {
	            System.out.println("Slot already occupied");
	        }
	    }

	    // Exposed via logs only
	    public void showLogs() {
	        bookingLogs.forEach(System.out::println);
	    }
	    
}
