package com.algorithmanalysis.stringapproach;

import java.util.*;

public class CompareString {
	 public static void main(String[] args) {

	        int N = 100_000;

	        // String timing
	        long startString = System.nanoTime();
	        StringOne.concatenate(N);
	        long endString = System.nanoTime();

	        // StringBuilder timing
	        long startBuilder = System.nanoTime();
	        StringBuilderOne.concatenate(N);
	        long endBuilder = System.nanoTime();

	        // StringBuffer timing
	        long startBuffer = System.nanoTime();
	        StringBufferOne.concatenate(N);
	        long endBuffer = System.nanoTime();

	        System.out.println("Operations Count: " + N);
	        System.out.println("String Time: " + (endString - startString) / 1_000_000.0 + " ms");
	        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) / 1_000_000.0 + " ms");
	        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) / 1_000_000.0 + " ms");
	    }

}
