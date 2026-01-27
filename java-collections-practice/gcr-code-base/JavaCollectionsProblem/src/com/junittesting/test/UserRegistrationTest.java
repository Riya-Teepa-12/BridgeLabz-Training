package com.junittesting.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junittesting.com.UserRegistration;

public class UserRegistrationTest {
       
	// Test valid registration
    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> 
            UserRegistration.registerUser("JohnDoe", "john@example.com", "Password123")
        );
    }

    // Test empty username
    @Test
    void testEmptyUsername() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("", "john@example.com", "Password123")
        );
        assertEquals("Username cannot be empty", ex.getMessage());
    }

    // Test invalid email
    @Test
    void testInvalidEmail() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("JohnDoe", "johnexample.com", "Password123")
        );
        assertEquals("Invalid email", ex.getMessage());
    }

    // Test short password
    @Test
    void testShortPassword() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("JohnDoe", "john@example.com", "Pass1")
        );
        assertEquals("Password must be at least 8 characters", ex.getMessage());
    }

    // Test null inputs
    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser(null, "john@example.com", "Password123")
        );
        assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser("JohnDoe", null, "Password123")
        );
        assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser("JohnDoe", "john@example.com", null)
        );
    }
}
