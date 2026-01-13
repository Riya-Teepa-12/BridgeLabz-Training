package com.day8.homenest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
        this.energyUsage = 0.15;
    }

   
    public void turnOn() {
        setStatus(true);
        firmwareUpdateLog("Camera recording started");
    }

  
    public void turnOff() {
        setStatus(false);
        firmwareUpdateLog("Camera shut down");
    }

   
    public void reset() {
        System.out.println("Camera reset: memory cleared");
    }

}
