package com.day8.homenest;

public class UseDevice {
	

    public static void main(String[] args) {

        Device light = new Light("L101");
        Device cam = new Camera("C202");

        User user = new User("Prince", light);
        user.addDevice(cam);

        light.turnOn();
        cam.turnOn();

        light.reset();   // Polymorphism
        cam.reset();

        System.out.println("Monthly Energy (Light): " +
                light.calculateMonthlyEnergy(6));
    }

}
