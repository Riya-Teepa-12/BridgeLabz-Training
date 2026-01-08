package com.algorithmanalysis.fibonacci;

public class CompareFibonacci {
	
	 public static void main(String[] args) {

	        int n = 30; // Change value to test performance

	        // Recursive timing
	        long startRecursive = System.nanoTime();
	        int recursiveResult = RecurssiveFibonacci.fibonacciRecursive(n);
	        long endRecursive = System.nanoTime();

	        // Iterative timing
	        long startIterative = System.nanoTime();
	        int iterativeResult = IterativeFibonacci.fibonacciIterative(n);
	        long endIterative = System.nanoTime();

	        System.out.println("Fibonacci Number (N) = " + n);
	        System.out.println("Recursive Result: " + recursiveResult);
	        System.out.println("Recursive Time: " +
	                (endRecursive - startRecursive) / 1_000_000.0 + " ms");

	        System.out.println("Iterative Result: " + iterativeResult);
	        System.out.println("Iterative Time: " +
	                (endIterative - startIterative) / 1_000_000.0 + " ms");
	    }

}
