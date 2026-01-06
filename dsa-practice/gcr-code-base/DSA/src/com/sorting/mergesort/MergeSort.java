package com.sorting.mergesort;

import java.util.*;

public class MergeSort {
      
	 // Merge Sort Method
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort first half
            mergeSort(arr, left, mid);

            // Sort second half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge Method
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Apply Merge Sort
        mergeSort(prices, 0, n - 1);

        // Display Sorted Prices
        System.out.println("Sorted Book Prices (Ascending Order):");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}
