package com.streams.foreach.iotsensorreadings;

import java.util.Arrays;
import java.util.List;

public class IOTSensorReadings {
	public static void main(String[] args){
        List<Double> readings=Arrays.asList(
            22.5,
            35.8,
            18.2,
            40.1,
            29.9
        );

        double threshold=30.0;

        readings.stream()
                .filter(r->r>threshold)
                .forEach(r->System.out.println("Alert Reading: "+r));
    }
}
