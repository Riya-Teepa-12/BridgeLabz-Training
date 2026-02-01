package com.lambdaExceptions.notificationfiltering;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseAlert {
	 public static void main(String[] args) {

	        List<Alert> alerts = new ArrayList<>();

	        alerts.add(new Alert(1, "Heart rate abnormal", AlertType.EMERGENCY));
	        alerts.add(new Alert(2, "Doctor appointment tomorrow", AlertType.APPOINTMENT));
	        alerts.add(new Alert(3, "Take BP medicine", AlertType.MEDICATION));
	        alerts.add(new Alert(4, "Blood test report ready", AlertType.LAB_REPORT));

	        // User preference: wants ONLY emergency & medication alerts
	        Predicate<Alert> userPreference =
	                alert -> alert.getType() == AlertType.EMERGENCY
	                      || alert.getType() == AlertType.MEDICATION;

	        List<Alert> filteredAlerts =
	                AlertFilter.filterAlerts(alerts, userPreference);

	        filteredAlerts.forEach(System.out::println);
	    }
}
