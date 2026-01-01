package com.inheritance.singlelevel.SmartHomeDevices;

public class Device {
    private int deviceId;
    private String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }

}
