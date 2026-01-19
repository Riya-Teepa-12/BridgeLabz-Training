package com.Day7.flashdealz;

public class FlashDealQuickSort {
	 // Quick Sort function
    public static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method (Descending order by discount)
    private static int partition(Product[] arr, int low, int high) {
        double pivot = arr[high].discount;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].discount > pivot) { // Descending
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap method
    private static void swap(Product[] arr, int i, int j) {
        Product temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
