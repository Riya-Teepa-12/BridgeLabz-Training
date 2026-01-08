package com.linearandbinarysearch.binarysearchproblem;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchProblem {
	 // Linear Search to find first missing positive integer
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return n + 1;
    }

    // Binary Search to find target index
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear Search part
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);

        // Binary Search part
        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();

        Arrays.sort(arr); // Required for Binary Search
        int index = binarySearch(arr, target);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Target Index: " + index);

        sc.close();
    }
}
