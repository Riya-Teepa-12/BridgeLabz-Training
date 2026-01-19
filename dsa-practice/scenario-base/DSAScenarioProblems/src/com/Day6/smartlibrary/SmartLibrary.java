package com.Day6.smartlibrary;

import java.util.*;

public class SmartLibrary {
         
	// Method to sort book titles using Insertion Sort
    public static void insertionSort(String[] books) {
        for (int i = 1; i < books.length; i++) {
            String key = books[i];
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Insert key at correct position
            books[j + 1] = key;
        }
  }
}