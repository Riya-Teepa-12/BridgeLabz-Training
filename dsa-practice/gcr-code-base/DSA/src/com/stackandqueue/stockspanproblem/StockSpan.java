package com.stackandqueue.stockspanproblem;

import java.util.Stack;

public class StockSpan {
	
	public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Pop while current price is higher or equal
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push index
            stack.push(i);
        }
        return span;
        
	}
}
