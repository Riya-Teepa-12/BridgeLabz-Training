package com.day1.smarthomesystem;

public class Fan extends Appliance {

    public Fan(int power) {
        super(power); 
    }


    public void turnOn() {
        setOn(true);
        System.out.println("Fan turned ON (Medium speed)");
    }

 
    public void turnOff() {
        setOn(false);
        System.out.println("Fan turned OFF");
    }

}
