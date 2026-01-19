package com.Day5.cropmonitor;

public class CropTest {
	 public static void main(String[] args) {

	        SensorReading[] readings = {
	            new SensorReading(170500, 24.5),
	            new SensorReading(170200, 22.1),
	            new SensorReading(170800, 25.0),
	            new SensorReading(170100, 21.8),
	            new SensorReading(170400, 23.6)
	        };

	        System.out.println("Before Sorting:");
	        for (SensorReading r : readings) {
	            System.out.println(r);
	        }

	        CropMonitor.quickSort(readings, 0, readings.length - 1);

	        System.out.println("\nAfter Sorting by Timestamp:");
	        for (SensorReading r : readings) {
	            System.out.println(r);
	        }
	    }
}
