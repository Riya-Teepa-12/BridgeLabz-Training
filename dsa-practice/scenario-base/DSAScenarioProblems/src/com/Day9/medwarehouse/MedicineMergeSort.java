package com.Day9.medwarehouse;

import java.util.*;
public class MedicineMergeSort {
      
	 public  static List<MedicineDetails> mergeSortedLists(List<MedicineDetails> a, List<MedicineDetails> b) {

	        List<MedicineDetails> result = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < a.size() && j < b.size()) {
	            if (a.get(i).getExpiryDate().isBefore(b.get(j).getExpiryDate())) {
	                result.add(a.get(i++));
	            } else {
	                result.add(b.get(j++));
	            }
	        }

	        while (i < a.size()) result.add(a.get(i++));
	        while (j < b.size()) result.add(b.get(j++));

	        return result;
    }
}
