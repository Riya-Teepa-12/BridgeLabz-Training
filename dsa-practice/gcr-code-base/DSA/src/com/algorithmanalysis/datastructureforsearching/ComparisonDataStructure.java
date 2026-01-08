package com.algorithmanalysis.datastructureforsearching;

import java.util.HashSet;
import java.util.TreeSet;

public class ComparisonDataStructure {
	
	public static void main(String[] args) {

        int N = 100000;   // dataset size
        int key = N - 1;  // search element (worst case for array)

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        Array arraySearch = new Array();
        HashSetSearch hashSetSearch = new HashSetSearch(hashSet);
        TreeSetSearch treeSetSearch = new TreeSetSearch(treeSet);

        long start, end;

        // Array search timing
        start = System.nanoTime();
        boolean arrayResult = arraySearch.search(array, key);
        end = System.nanoTime();
        System.out.println("Array Search: " + arrayResult +
                " | Time: " + (end - start) / 1_000_000.0 + " ms");

        // HashSet search timing
        start = System.nanoTime();
        boolean hashSetResult = hashSetSearch.search(key);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + hashSetResult +
                " | Time: " + (end - start) / 1_000_000.0 + " ms");

        // TreeSet search timing
        start = System.nanoTime();
        boolean treeSetResult = treeSetSearch.search(key);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + treeSetResult +
                " | Time: " + (end - start) / 1_000_000.0 + " ms");
    }

}
