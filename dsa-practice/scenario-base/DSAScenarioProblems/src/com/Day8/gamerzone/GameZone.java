package com.Day8.gamerzone;

import java.util.*;

public class GameZone {

	// Quick Sort
    public static void quickSort(List<Player> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);

            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    // Partition logic (Descending order)
    private static int partition(List<Player> list, int low, int high) {
        int pivot = list.get(high).score;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j).score >= pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }

        Collections.swap(list, i + 1, high);
        return i + 1;
    }
}
