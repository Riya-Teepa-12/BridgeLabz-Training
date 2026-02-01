package com.functionalinterfaces.smartvehicledashboard;

public interface Vehicle {
	void displaySpeed();

    default void displayBatteryPercentage() {
        // Default implementation: not applicable for non-electric vehicles
        System.out.println("Battery information not available for this vehicle");
    }

}
