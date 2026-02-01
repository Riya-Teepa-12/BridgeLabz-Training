package com.functionalinterfaces.temperaturealertsystem;

import java.util.List;

public class TemperatureSensor {
	 private List<Double> temperatures;

	    public TemperatureSensor(List<Double> temperatures) {
	        this.temperatures=temperatures;
	    }

	    public List<Double> getTemperatures() {
	        return temperatures;
	    }

}
