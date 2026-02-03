package com.Day1.functionalinterface.functionExamples;

import java.util.function.Function;

public class TemeratureFunction {
      
	 public static void main(String[] args) {

	        Function<Double, Double> celsiusToFahrenheit =
	                celsius -> (celsius * 9 / 5) + 32;

	        double tempC = 37.0;
	        System.out.println("Fahrenheit: " +
	                celsiusToFahrenheit.apply(tempC));
	    }
}
