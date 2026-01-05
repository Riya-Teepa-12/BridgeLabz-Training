package com.stackandqueue.stackusingrecursion;

import java.util.Stack;

public class StackUsingRecursion {
     
	  // Function to sort the stack
     public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        sortStack(stack);
        insertSorted(stack, temp);
    }

    // Function to insert element in sorted order
     private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, element);
        stack.push(temp);
    }
}
