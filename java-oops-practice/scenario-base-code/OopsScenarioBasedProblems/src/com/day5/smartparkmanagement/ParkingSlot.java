package com.day5.smartparkmanagement;

public class ParkingSlot {
	 private final String slotId;
	    private boolean isOccupied;
	    private String vehicleTypeAllowed;
	    private String location;

	    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
	        this.slotId = slotId;
	        this.location = location;
	        this.vehicleTypeAllowed = vehicleTypeAllowed;
	        this.isOccupied = false;
	    }

	    // Encapsulation: no direct setter
	    public boolean isAvailable() {
	        return !isOccupied;
	    }

	    public boolean bookSlot() {
	        if (!isOccupied) {
	            isOccupied = true;
	            return true;
	        }
	        return false;
	    }

	    public void releaseSlot() {
	        isOccupied = false;
	    }

	    public String getSlotId() {
	        return slotId;
	    }
}
