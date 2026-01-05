package com.stackandqueue.QueueUsingStack;

import java.util.Stack;

public class QueueUsingStack {
       
	Stack<Integer> stackEnq = new Stack<>();
    Stack<Integer> stackDeq = new Stack<>();

    // Enqueue operation
    public void enqueue(int x) {
        stackEnq.push(x);
        System.out.println(x + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {
        if (stackDeq.isEmpty()) {
            if (stackEnq.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            // Transfer elements
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        return stackDeq.pop();
    }

    // Peek front element
    public int peek() {
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        return stackDeq.isEmpty() ? -1 : stackDeq.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stackEnq.isEmpty() && stackDeq.isEmpty();
    }
}
