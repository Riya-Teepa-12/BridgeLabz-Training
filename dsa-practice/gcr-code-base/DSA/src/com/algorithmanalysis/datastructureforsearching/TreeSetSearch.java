package com.algorithmanalysis.datastructureforsearching;

import java.util.TreeSet;

public class TreeSetSearch {
	
	  private TreeSet<Integer> set;

	    public TreeSetSearch(TreeSet<Integer> set) {
	        this.set = set;
	    }

	    // TreeSet search (O(log N))
	    public boolean search(int key) {
	        return set.contains(key);
	    }

}
