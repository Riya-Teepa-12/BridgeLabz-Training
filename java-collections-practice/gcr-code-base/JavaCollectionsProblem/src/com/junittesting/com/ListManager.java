package com.junittesting.com;

import java.util.List;

public class ListManager {

	 // Add element to list
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Remove element from list
    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element)); 
    }

    // Get size of list
    public static int getSize(List<Integer> list) {
        return list.size();
    }
}
