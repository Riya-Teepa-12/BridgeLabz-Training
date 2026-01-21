package com.Day8.foodfest;

import java.util.*;

public class FoodFest {
     
	// Merge Sort
    public static void mergeSort(List<Stall> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);

            merge(list, left, mid, right);
        }
    }

    // Stable merge
    private static void merge(List<Stall> list, int left, int mid, int right) {
        List<Stall> temp = new ArrayList<>();

        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {
            if (list.get(i).footfall <= list.get(j).footfall) {
                temp.add(list.get(i++));   // stability preserved
            } else {
                temp.add(list.get(j++));
            }
        }

        while (i <= mid) temp.add(list.get(i++));
        while (j <= right) temp.add(list.get(j++));

        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
   }
    
 
    
}


