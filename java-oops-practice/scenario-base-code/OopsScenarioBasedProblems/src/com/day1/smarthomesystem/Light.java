package com.day1.smarthomesystem;

public class Light extends Appliance {

    public Light() {
        super(10); // default 10W
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light turned ON (Soft glow)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light turned OFF");
    }

}
