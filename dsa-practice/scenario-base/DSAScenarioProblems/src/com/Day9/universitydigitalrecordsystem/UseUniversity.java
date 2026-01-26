package com.Day9.universitydigitalrecordsystem;

public class UseUniversity {
	public static void main(String[] args) {

        StudentBST bst = new StudentBST();
        
        //inserting data
        bst.root = bst.insert(bst.root, 101, "Amit");
        bst.insert(bst.root, 105, "Neha");
        bst.insert(bst.root, 102, "Kunal");
        bst.insert(bst.root, 110, "Sneha");

        System.out.println("Student List (Sorted by Roll Number)");
        bst.inorder(bst.root);

        System.out.println();
        System.out.println("Removing student with Roll No 102");

        bst.root = bst.delete(bst.root, 102);

        System.out.println();
        System.out.println("Updated Student List");
        bst.inorder(bst.root);
    }
}
