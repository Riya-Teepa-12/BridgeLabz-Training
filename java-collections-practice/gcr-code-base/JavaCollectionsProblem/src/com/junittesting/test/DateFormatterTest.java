package com.junittesting.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junittesting.com.DateFormatter;

public class DateFormatterTest {

	 // Test valid dates
    @Test
    void testValidDates() {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2020", DateFormatter.formatDate("2020-01-01"));
        assertEquals("29-02-2020", DateFormatter.formatDate("2020-02-29")); // leap year
    }

    // Test invalid dates
    @Test
    void testInvalidDates() {
        // Invalid format
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("12/25/2023");
        });
        assertTrue(ex1.getMessage().contains("Invalid date format"));

        // Invalid date (non-leap year Feb 29)
        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("2019-02-29");
        });
        assertTrue(ex2.getMessage().contains("Invalid date format"));

        // Null input
        Exception ex3 = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate(null);
        });
        assertTrue(ex3.getMessage().contains("Invalid date format"));
    }
}
