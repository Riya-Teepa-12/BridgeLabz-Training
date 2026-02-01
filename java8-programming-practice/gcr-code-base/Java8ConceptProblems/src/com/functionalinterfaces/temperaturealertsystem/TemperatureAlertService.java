package com.functionalinterfaces.temperaturealertsystem;

import java.util.List;
import java.util.function.Predicate;

public class TemperatureAlertService {
	 public static void checkTemperature(
	            List<Double> temperatures,
	            Predicate<Double> alertCondition) {

	        for (Double temp : temperatures) {
	            if (alertCondition.test(temp)) {
	                System.out.println("ALERT! Temperature crossed threshold: " + temp);
	            }
	        }
	    }

}
