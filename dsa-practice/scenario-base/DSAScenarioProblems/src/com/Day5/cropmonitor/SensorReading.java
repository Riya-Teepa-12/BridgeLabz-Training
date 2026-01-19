package com.Day5.cropmonitor;

public class SensorReading {
	 long timestamp;     
	    double temperature;  

	    SensorReading(long timestamp, double temperature) {
	        this.timestamp = timestamp;
	        this.temperature = temperature;
	    }

	    @Override
	    public String toString() {
	        return "Time: " + timestamp + " Temp: " + temperature;
	    }
}
