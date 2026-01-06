package com.sorting.selectionsort;

import java.util.*;

public class SelectionSort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Selection Sort Logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        // Display Sorted Exam Scores
        System.out.println("Sorted Exam Scores (Ascending Order):");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        sc.close();
    }
}
