package com.linkedlist.singlylinkedlist.studentmanagement;

public class UseStudentLinkedList {
	 public static void main(String[] args) {
	        StudentLinkedList list = new StudentLinkedList();

	        list.addAtBeginning(1, "Alice", 20, 'A');
	        list.addAtEnd(2, "Bob", 21, 'B');
	        list.addAtEnd(3, "Charlie", 22, 'C');
	        list.addAtPosition(2, 4, "David", 23, 'B');

	        list.display();

	        list.searchByRollNo(2);

	        list.updateGrade(3, 'A');

	        list.deleteByRollNo(1);

	        list.display();
	    }

}
