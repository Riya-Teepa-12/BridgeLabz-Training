package com.Day5.cropmonitor;

public class CropMonitor {
	 // Quick Sort method
    public static void quickSort(SensorReading[] data, int low, int high) {
        if (low < high) {
            int p = partition(data, low, high);
            quickSort(data, low, p - 1);
            quickSort(data, p + 1, high);
        }
    }

    // Partition based on timestamp
    private static int partition(SensorReading[] data, int low, int high) {
        long pivot = data[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp < pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    private static void swap(SensorReading[] data, int i, int j) {
        SensorReading temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
