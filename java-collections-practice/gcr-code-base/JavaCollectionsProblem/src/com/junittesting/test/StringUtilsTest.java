package com.junittesting.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.junittesting.com.StringUtils;

public class StringUtilsTest {

    // Test reverse()
    @Test
    public void testReverse() {
        assertEquals("olleH", StringUtils.reverse("Hello"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    // Test isPalindrome()
    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("level"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    // Test toUpperCase()
    @Test
    public void testToUpperCase() {
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
        assertEquals("HELLO WORLD", StringUtils.toUpperCase("Hello World"));
        assertNull(StringUtils.toUpperCase(null));
    }
}