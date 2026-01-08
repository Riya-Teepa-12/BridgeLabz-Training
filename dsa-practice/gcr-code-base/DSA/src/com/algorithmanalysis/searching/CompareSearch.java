package com.algorithmanalysis.searching;

import java.util.Arrays;

public class CompareSearch {
 
	  public static void main(String[] args) {

	        int N = 1_000_000;     
	        int target = N - 1;  

	        int[] data = new int[N];

	        // Fill array
	        for (int i = 0; i < N; i++) {
	            data[i] = i;
	        }

	        // Linear Search Timing
	        long startLinear = System.nanoTime();
	        LinearSearch.search(data, target);
	        long endLinear = System.nanoTime();

	        // Sort array (required for Binary Search)
	        Arrays.sort(data);

	        // Binary Search Timing
	        long startBinary = System.nanoTime();
	        BinarySearch.search(data, target);
	        long endBinary = System.nanoTime();

	        // Convert time to milliseconds
	        double linearTime = (endLinear - startLinear) / 1_000_000.0;
	        double binaryTime = (endBinary - startBinary) / 1_000_000.0;

	        // Output
	        System.out.println("Dataset Size: " + N);
	        System.out.println("Linear Search Time: " + linearTime + " ms");
	        System.out.println("Binary Search Time: " + binaryTime + " ms");
	    }
}
