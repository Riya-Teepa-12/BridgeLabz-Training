package com.collections.listinterface;

import java.util.*;

public class ReverseList{
    static Node head;
	public static List<Integer> reverseArrayList(List<Integer> list){
		List<Integer> list1 = new ArrayList<>();
		int i=0;
		int j = list.size()-1;
		   while(j>=i) {
			  list1.add(list.get(j));
			  j--;
		   }
		   return list1;
	}
	public static void reverseLinkedList(){
		
		        Node prev = null;
		        Node current = head;
		        Node next = null;

		        while (current != null) {
		            next = current.next;   // store next
		            current.next = prev;   // reverse link
		            prev = current;        // move prev
		            current = next;        // move current
		        }
		        head = prev;
		    }

		    static void printList() {
		        Node temp = head;
		        while (temp != null) {
		            System.out.print(temp.data + " ");
		            temp = temp.next;
		        }
		        System.out.println();
		   
	}
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Input five numbers you want to reverse through LinkedList");
		    head = new Node(kb.nextInt());
	        head.next = new Node(kb.nextInt());
	        head.next.next = new Node(kb.nextInt());
	        head.next.next.next = new Node(kb.nextInt());
	        head.next.next.next.next = new Node(kb.nextInt());

	        reverseLinkedList();

	        printList();
	        
	        System.out.println("Input five numbers you want to reverse through ArrayList");
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(kb.nextInt());
	        list.add(kb.nextInt());
	        list.add(kb.nextInt());
	        list.add(kb.nextInt());
	        list.add(kb.nextInt());
	        List<Integer> list2 = reverseArrayList(list);
	        for(int x:list2) {
	        	System.out.print(x+" ");
	        }
	}
}
