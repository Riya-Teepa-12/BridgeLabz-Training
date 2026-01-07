package com.linearandbinarysearch.binarysearchproblem;

import java.util.*;

public class PeakElementInArray {
	public static int findPeak(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if mid is a peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                (mid == n - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }

            // Move to the side having larger neighbor
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element Value: " + arr[peakIndex]);

        sc.close();
    }

}
