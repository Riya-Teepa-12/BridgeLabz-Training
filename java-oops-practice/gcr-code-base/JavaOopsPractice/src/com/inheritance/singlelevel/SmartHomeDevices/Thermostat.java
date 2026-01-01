package com.inheritance.singlelevel.SmartHomeDevices;

public class Thermostat  extends Device {
	private int temperatureSetting;

    Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status); 
        this.temperatureSetting = temperatureSetting;
    }

   
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
