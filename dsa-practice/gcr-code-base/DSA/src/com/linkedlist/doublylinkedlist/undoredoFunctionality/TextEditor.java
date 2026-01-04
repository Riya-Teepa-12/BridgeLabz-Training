package com.linkedlist.doublylinkedlist.undoredoFunctionality;

public class TextEditor {
	 private TextState head;
	    private TextState tail;
	    private TextState current;
	    private int size;
	    private final int MAX_SIZE = 10;

	    // Add new text state
	    public void addState(String content) {
	        TextState newNode = new TextState(content);

	        // If undo was used, clear redo history
	        if (current != null && current.next != null) {
	            current.next.prev = null;
	            current.next = null;
	            tail = current;
	            size = countSize();
	        }

	        if (head == null) {
	            head = tail = current = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = current = newNode;
	        }

	        size++;

	        // Maintain history limit
	        if (size > MAX_SIZE) {
	            head = head.next;
	            head.prev = null;
	            size--;
	        }
	    }

	    // Undo operation
	    public void undo() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	            System.out.println("Undo successful.");
	        } else {
	            System.out.println("No more undo available.");
	        }
	    }

	    // Redo operation
	    public void redo() {
	        if (current != null && current.next != null) {
	            current = current.next;
	            System.out.println("Redo successful.");
	        } else {
	            System.out.println("No more redo available.");
	        }
	    }

	    // Display current text
	    public void displayCurrentState() {
	        if (current != null) {
	            System.out.println("Current Text: " + current.content);
	        } else {
	            System.out.println("Editor is empty.");
	        }
	    }

	    // Helper to count nodes
	    private int countSize() {
	        int count = 0;
	        TextState temp = head;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	}


