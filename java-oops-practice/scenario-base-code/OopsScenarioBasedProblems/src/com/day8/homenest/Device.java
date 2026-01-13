package com.day8.homenest;

public abstract class Device implements IControllable{
	    private String deviceId;        
	    private boolean status;           
	    protected double energyUsage;      

	    // Secured firmware logs
	    protected void firmwareUpdateLog(String msg) {
	        System.out.println("[Firmware Log] " + msg);
	    }

	    // Constructor
	    public Device(String deviceId) {
	        this.deviceId = deviceId;
	        this.status = false;
	    }

	    // Getters only (no setter for status)
	    public String getDeviceId() {
	        return deviceId;
	    }

	    public boolean isOn() {
	        return status;
	    }

	    protected void setStatus(boolean status) {
	        this.status = status;
	    }

	    // Operator usage
	    public double calculateMonthlyEnergy(double hoursPerDay) {
	        return energyUsage * hoursPerDay * 30;
	    }
}
