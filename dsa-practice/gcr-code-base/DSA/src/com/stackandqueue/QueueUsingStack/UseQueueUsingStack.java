package com.stackandqueue.QueueUsingStack;

public class UseQueueUsingStack {
	 public static void main(String[] args) {
	        QueueUsingStack q = new QueueUsingStack();

	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);

	        System.out.println("Dequeued: " + q.dequeue());
	        System.out.println("Front: " + q.peek());
	        System.out.println("Dequeued: " + q.dequeue());
	  }
}
