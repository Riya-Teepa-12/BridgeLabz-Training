package com.Day6.fleetmanager;

import java.util.*;

public class FleetManager {
   
	// Merge Sort Method
    public static void mergeSort(List<Vehicle> list) {
        if (list.size() <= 1) return;

        int mid = list.size() / 2;

        List<Vehicle> left = new ArrayList<>(list.subList(0, mid));
        List<Vehicle> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    // Merge Two Sorted Lists
    private static void merge(List<Vehicle> result,
                              List<Vehicle> left,
                              List<Vehicle> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).mileage <= right.get(j).mileage) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
 }
}
