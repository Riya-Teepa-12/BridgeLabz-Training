package com.algorithmanalysis.sorting;

import java.util.Random;

public class CompareSorting {
	 public static void main(String[] args) {

	        int N = 10000; // change to 1000 or 100000 for testing
	        int[] original = new int[N];
	        Random rand = new Random();

	        for (int i = 0; i < N; i++) {
	            original[i] = rand.nextInt(N);
	        }

	        int[] bubbleArr = original.clone();
	        int[] mergeArr = original.clone();
	        int[] quickArr = original.clone();

	        // Bubble Sort Timing
	        long startBubble = System.nanoTime();
	        BubbleSort.sort(bubbleArr);
	        long endBubble = System.nanoTime();

	        // Merge Sort Timing
	        long startMerge = System.nanoTime();
	        MergeSort.sort(mergeArr, 0, mergeArr.length - 1);
	        long endMerge = System.nanoTime();

	        // Quick Sort Timing
	        long startQuick = System.nanoTime();
	        QuickSort.sort(quickArr, 0, quickArr.length - 1);
	        long endQuick = System.nanoTime();

	        System.out.println("Dataset Size: " + N);
	        System.out.println("Bubble Sort Time: " + (endBubble - startBubble) / 1_000_000.0 + " ms");
	        System.out.println("Merge Sort Time: " + (endMerge - startMerge) / 1_000_000.0 + " ms");
	        System.out.println("Quick Sort Time: " + (endQuick - startQuick) / 1_000_000.0 + " ms");
	    }
}
