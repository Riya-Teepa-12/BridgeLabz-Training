package com.day1.smarthomesystem;

public abstract class Appliance implements Controllable {
    private boolean isOn;
    private int powerConsumption; // watts

    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    protected void setOn(boolean state) {
        isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }

}
