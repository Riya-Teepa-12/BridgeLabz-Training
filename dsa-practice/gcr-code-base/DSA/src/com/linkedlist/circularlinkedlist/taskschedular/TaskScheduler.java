package com.linkedlist.circularlinkedlist.taskschedular;

public class TaskScheduler {
	 private TaskNode head;
	    private TaskNode current;

	    // Add at beginning
	    public void addAtBeginning(int id, String name, int priority, String dueDate) {
	        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

	        if (head == null) {
	            head = current = newNode;
	        } else {
	            TaskNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            newNode.next = head;
	            temp.next = newNode;
	            head = newNode;
	        }
	        System.out.println("Task added at beginning.");
	    }

	    // Add at end
	    public void addAtEnd(int id, String name, int priority, String dueDate) {
	        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

	        if (head == null) {
	            head = current = newNode;
	        } else {
	            TaskNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.next = head;
	        }
	        System.out.println("Task added at end.");
	    }

	    // Add at specific position
	    public void addAtPosition(int id, String name, int priority, String dueDate, int position) {
	        if (position <= 1 || head == null) {
	            addAtBeginning(id, name, priority, dueDate);
	            return;
	        }

	        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
	        TaskNode temp = head;
	        int count = 1;

	        while (count < position - 1 && temp.next != head) {
	            temp = temp.next;
	            count++;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	        System.out.println("Task added at position " + position);
	    }

	    // Remove task by ID
	    public void removeTask(int taskId) {
	        if (head == null) {
	            System.out.println("Task list is empty.");
	            return;
	        }

	        TaskNode temp = head;
	        TaskNode prev = null;

	        do {
	            if (temp.taskId == taskId) {
	                if (temp == head) {
	                    TaskNode last = head;
	                    while (last.next != head) {
	                        last = last.next;
	                    }
	                    head = head.next;
	                    last.next = head;
	                } else {
	                    prev.next = temp.next;
	                }

	                if (current == temp) {
	                    current = temp.next;
	                }

	                System.out.println("Task removed successfully.");
	                return;
	            }
	            prev = temp;
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("Task ID not found.");
	    }

	    // View current task and move to next
	    public void viewNextTask() {
	        if (current == null) {
	            System.out.println("No tasks available.");
	            return;
	        }

	        System.out.println("\nCurrent Task:");
	        displayTask(current);
	        current = current.next;
	    }

	    // Search by priority
	    public void searchByPriority(int priority) {
	        if (head == null) {
	            System.out.println("Task list is empty.");
	            return;
	        }

	        TaskNode temp = head;
	        boolean found = false;

	        do {
	            if (temp.priority == priority) {
	                displayTask(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found) {
	            System.out.println("No tasks found with priority " + priority);
	        }
	    }

	    // Display all tasks
	    public void displayAllTasks() {
	        if (head == null) {
	            System.out.println("Task list is empty.");
	            return;
	        }

	        TaskNode temp = head;
	        System.out.println("\n--- Task List ---");
	        do {
	            displayTask(temp);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    private void displayTask(TaskNode t) {
	        System.out.println("Task ID: " + t.taskId +
	                ", Name: " + t.taskName +
	                ", Priority: " + t.priority +
	                ", Due Date: " + t.dueDate);
	    }

}
