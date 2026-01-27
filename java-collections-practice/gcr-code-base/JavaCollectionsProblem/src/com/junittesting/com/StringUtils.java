package com.junittesting.com;

public class StringUtils {
	// Reverse a string
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // Check if string is palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        return str.equals(reverse(str));
    }

    // Convert to uppercase
    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
}
