package com.junittesting.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junittesting.com.TemperatureConverter;

public class TemeratureConverterTest {
	 private static final double DELTA = 0.0001; 

	    // Test Celsius to Fahrenheit
	    @Test
	    void testCelsiusToFahrenheit() {
	        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), DELTA);
	        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), DELTA);
	        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), DELTA);
	        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), DELTA); // edge case
	    }

	    // Test Fahrenheit to Celsius
	    @Test
	    void testFahrenheitToCelsius() {
	        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), DELTA);
	        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), DELTA);
	        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), DELTA);
	        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40), DELTA); // edge case
	    }
}
