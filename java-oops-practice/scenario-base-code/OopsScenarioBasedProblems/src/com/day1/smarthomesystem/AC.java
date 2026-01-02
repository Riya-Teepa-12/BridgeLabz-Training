package com.day1.smarthomesystem;

public class AC extends Appliance {

    public AC() {
        super(1500); // high power usage
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC turned ON (Cooling mode)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC turned OFF");
    }

}
