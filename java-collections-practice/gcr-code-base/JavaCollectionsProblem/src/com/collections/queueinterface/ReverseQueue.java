package com.collections.queueinterface;

import java.util.*;

public class ReverseQueue {

    public static Queue<Integer> reverseQueue(Queue<Integer> q1) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements into stack
        while (!q1.isEmpty()) {
            stack.push(q1.remove());
        }

        //Pop from stack and add back to queue
        while (!stack.isEmpty()) {
            q1.add(stack.pop());
        }

        return q1;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter number of elements you want to add:");
        int n = kb.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(kb.nextInt());
        }

        Queue<Integer> reversedQueue = reverseQueue(queue);

        System.out.println("The reversed queue is " + reversedQueue);
    }
}
