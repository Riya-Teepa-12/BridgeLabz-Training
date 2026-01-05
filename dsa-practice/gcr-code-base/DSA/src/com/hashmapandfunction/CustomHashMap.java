package com.hashmapandfunction;

public class CustomHashMap{
	
	    // Node for linked list
	    static class Node {
	        int key;
	        int value;
	        Node next;

	        Node(int key, int value) {
	            this.key = key;
	            this.value = value;
	        }
	    }

	    private static final int CAPACITY = 16;
	    private Node[] buckets;
	    private int size;

	    public CustomHashMap() {
	        buckets = new Node[CAPACITY];
	        size = 0;
	    }

	    // Hash function
	    private int getIndex(int key) {
	        return key % CAPACITY;
	    }

	    // Insert or update
	    public void put(int key, int value) {
	        int index = getIndex(key);
	        Node head = buckets[index];

	        while (head != null) {
	            if (head.key == key) {
	                head.value = value; // update
	                return;
	            }
	            head = head.next;
	        }

	        Node newNode = new Node(key, value);
	        newNode.next = buckets[index];
	        buckets[index] = newNode;
	        size++;
	    }

	    // Retrieve value
	    public int get(int key) {
	        int index = getIndex(key);
	        Node head = buckets[index];

	        while (head != null) {
	            if (head.key == key) {
	                return head.value;
	            }
	            head = head.next;
	        }
	        return -1; // not found
	    }

	    // Remove key
	    public boolean remove(int key) {
	        int index = getIndex(key);
	        Node head = buckets[index];
	        Node prev = null;

	        while (head != null) {
	            if (head.key == key) {
	                if (prev == null) {
	                    buckets[index] = head.next;
	                } else {
	                    prev.next = head.next;
	                }
	                size--;
	                return true;
	            }
	            prev = head;
	            head = head.next;
	        }
	        return false;
	    }

	    public int size() {
	        return size;
	   
	    }
	}

