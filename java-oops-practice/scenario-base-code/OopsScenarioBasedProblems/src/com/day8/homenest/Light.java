package com.day8.homenest;

public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId);
        this.energyUsage = 0.06;
    }

  
    public void turnOn() {
        setStatus(true);
        firmwareUpdateLog("Light turned ON");
    }

 
    public void turnOff() {
        setStatus(false);
        firmwareUpdateLog("Light turned OFF");
    }


    public void reset() {
        System.out.println("Light brightness reset to default");
    }

}
