package com.lambdaExceptions.smarthomelightingautomation;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartLightController {
	 public void executeAction(LightAction action) {
	        action.activate();
	    }
}
