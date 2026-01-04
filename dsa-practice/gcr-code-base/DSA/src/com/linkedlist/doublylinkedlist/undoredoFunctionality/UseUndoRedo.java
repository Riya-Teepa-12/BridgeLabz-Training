package com.linkedlist.doublylinkedlist.undoredoFunctionality;

import java.util.Scanner;

public class UseUndoRedo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        TextEditor editor = new TextEditor();

	        while (true) {
	            System.out.println("\n--- Text Editor Menu ---");
	            System.out.println("1. Type/Add Text");
	            System.out.println("2. Undo");
	            System.out.println("3. Redo");
	            System.out.println("4. Display Current Text");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter text: ");
	                    String text = sc.nextLine();
	                    editor.addState(text);
	                    break;

	                case 2:
	                    editor.undo();
	                    break;

	                case 3:
	                    editor.redo();
	                    break;

	                case 4:
	                    editor.displayCurrentState();
	                    break;

	                case 5:
	                    System.out.println("Exiting editor...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }

}
