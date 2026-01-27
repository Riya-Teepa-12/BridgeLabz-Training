package com.junittesting.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.junittesting.com.ListManager;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
      
	private List<Integer> list;

    // Runs before each test
    @Before
    public void setUp() {
        list = new ArrayList<>();
    }

    // Test adding elements
    @Test
    public void testAddElement() {
        ListManager.addElement(list, 10);
        ListManager.addElement(list, 20);

        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
        assertEquals(2, ListManager.getSize(list));
    }

    // Test removing elements
    @Test
    public void testRemoveElement() {
        list.add(10);
        list.add(20);
        list.add(30);

        ListManager.removeElement(list, 20);

        assertFalse(list.contains(20));
        assertEquals(2, ListManager.getSize(list));
    }

    // Test list size
    @Test
    public void testGetSize() {
        assertEquals(0, ListManager.getSize(list));

        list.add(1);
        list.add(2);

        assertEquals(2, ListManager.getSize(list));
    }
}
