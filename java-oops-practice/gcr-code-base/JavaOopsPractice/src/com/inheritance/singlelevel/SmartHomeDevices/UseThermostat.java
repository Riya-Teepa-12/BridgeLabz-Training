package com.inheritance.singlelevel.SmartHomeDevices;

public class UseThermostat {
	 public static void main(String[] args) {
	        Thermostat thermostat = new Thermostat(101, "ON", 24);
	        thermostat.displayStatus();
	    }
}
