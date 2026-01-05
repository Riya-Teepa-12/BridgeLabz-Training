package com.stackandqueue.stockspanproblem;

import java.util.Scanner;
import java.util.Stack;

public class UseStockSpan {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of days: ");
	        int n = sc.nextInt();

	        int[] prices = new int[n];

	        System.out.println("Enter stock prices:");
	        for (int i = 0; i < n; i++) {
	            prices[i] = sc.nextInt();
	        }
        
	        int[] span = StockSpan.calculateSpan(prices);

	        System.out.println("Stock Span for each day:");
	        for (int s : span) {
	            System.out.print(s + " ");
	        }

	        sc.close();
	    }
	
}
