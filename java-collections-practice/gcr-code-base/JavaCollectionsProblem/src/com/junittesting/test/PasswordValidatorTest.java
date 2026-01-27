package com.junittesting.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junittesting.com.PasswordValidator;

public class PasswordValidatorTest {
	// Test valid passwords
    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValid("Password1"));
        assertTrue(PasswordValidator.isValid("Abcdefg2H"));
        assertTrue(PasswordValidator.isValid("StrongPass123"));
    }

    // Test invalid passwords (too short)
    @Test
    void testTooShortPasswords() {
        assertFalse(PasswordValidator.isValid("Ab1")); // less than 8
        assertFalse(PasswordValidator.isValid("A1b2C3")); // less than 8
    }

    // Test invalid passwords (no uppercase)
    @Test
    void testNoUppercase() {
        assertFalse(PasswordValidator.isValid("password1"));
        assertFalse(PasswordValidator.isValid("abcdefgh1"));
    }

    // Test invalid passwords (no digit)
    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("Password"));
        assertFalse(PasswordValidator.isValid("StrongPass"));
    }

    // Test null password
    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }
}
