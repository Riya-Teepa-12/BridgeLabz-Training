package com.day8.homenest;

public class Lock  extends Device {

    public Lock(String deviceId) {
        super(deviceId);
        this.energyUsage = 0.02;
    }

  
    public void turnOn() {
        setStatus(true);
        firmwareUpdateLog("Lock engaged");
    }

  
    public void turnOff() {
        setStatus(false);
        firmwareUpdateLog("Lock disengaged");
    }

 
    public void reset() {
        System.out.println("Lock reset: access codes refreshed");
    }

}
