package com.functionalinterfaces.temperaturealertsystem;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UseTemperatureService {
	public static void main(String[] args) {

        List<Double> readings=Arrays.asList(32.5, 36.8, 38.2, 34.1, 40.0);

        TemperatureSensor sensor = new TemperatureSensor(readings);

        // Threshold alert condition
        Predicate<Double> highTemperatureAlert=temp -> temp > 37.0;

        TemperatureAlertService.checkTemperature(sensor.getTemperatures(),highTemperatureAlert);
    }

}
