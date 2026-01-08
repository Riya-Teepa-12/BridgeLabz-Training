package com.algorithmanalysis.datastructureforsearching;

import java.util.HashSet;

public class HashSetSearch {
 
	  private HashSet<Integer> set;

	    public HashSetSearch(HashSet<Integer> set) {
	        this.set = set;
	    }

	    // HashSet search (O(1) average)
	    public boolean search(int key) {
	        return set.contains(key);
	    }
	    
}
