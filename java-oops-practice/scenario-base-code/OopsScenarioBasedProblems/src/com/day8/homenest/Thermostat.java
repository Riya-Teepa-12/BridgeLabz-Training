package com.day8.homenest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
        this.energyUsage = 1.2;
    }

    
    public void turnOn() {
        setStatus(true);
        firmwareUpdateLog("Thermostat active");
    }

    
    public void turnOff() {
        setStatus(false);
        firmwareUpdateLog("Thermostat stopped");
    }

   
    public void reset() {
        System.out.println("Thermostat reset to 24°C");
    }

}
