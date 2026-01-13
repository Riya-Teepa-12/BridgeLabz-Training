package com.day8.homenest;


import java.util.*;

public class User {
	
	 private String username;
	    private List<Device> devices = new ArrayList<>();

	    public User(String username, Device device) {
	        this.username = username;
	        devices.add(device);
	    }

	    public void addDevice(Device device) {
	        devices.add(device);
	    }

	    public void showDevices() {
	        for (Device d : devices) {
	            System.out.println(d.getDeviceId() + " | Status: " + d.isOn());
	        }
	    }

}
