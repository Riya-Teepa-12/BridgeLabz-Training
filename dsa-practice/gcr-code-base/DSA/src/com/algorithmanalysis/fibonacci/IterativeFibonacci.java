package com.algorithmanalysis.fibonacci;

public class IterativeFibonacci {
	public static int fibonacciIterative(int n) {
	    int a = 0, b = 1, sum;
	    for (int i = 2; i <= n; i++) {
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    return b;
	}
}
