package com.day1.smarthomesystem;

public class UseAppliance {
	 public static void main(String[] args) {

	        Appliance light = new Light();
	        Appliance fan = new Fan(75);
	        Appliance ac = new AC();

	        UserController controller = new UserController();

	        controller.controlDevice(light, true);
	        controller.controlDevice(ac, true);

	        controller.compareEnergy(fan, ac);
	    }

}
