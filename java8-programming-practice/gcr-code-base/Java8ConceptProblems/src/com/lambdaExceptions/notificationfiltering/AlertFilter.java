package com.lambdaExceptions.notificationfiltering;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


enum AlertType {
    EMERGENCY,
    APPOINTMENT,
    MEDICATION,
    LAB_REPORT
}


public class AlertFilter {
	public static List<Alert> filterAlerts(
            List<Alert> alerts,
            Predicate<Alert> condition) {

        return alerts.stream()
                     .filter(condition)
                     .collect(Collectors.toList());
    }
}
