package com.algorithmanalysis.datastructureforsearching;

public class Array {
	
	public boolean search(int[] arr, int key) {
        for (int value : arr) {
            if (value == key)
                return true;
        }
        return false;
    }

}
