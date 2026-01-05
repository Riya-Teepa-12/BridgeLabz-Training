package com.stackandqueue.slidingwindowmaximum;

import java.util.*;

public class UseSlidingWindow {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
         
	        System.out.print("Enter window size k: ");
	        int k = sc.nextInt();
            
	        int[] maxValues = SlidingWindowMaximum.maxSlidingWindow(arr, k);

	        System.out.println("Maximum in each sliding window:");
	        for (int val : maxValues) {
	            System.out.print(val + " ");
	        }
                   
	        sc.close();
	    }

}
