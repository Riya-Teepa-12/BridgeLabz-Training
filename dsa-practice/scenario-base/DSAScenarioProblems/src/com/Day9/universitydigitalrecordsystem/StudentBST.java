package com.Day9.universitydigitalrecordsystem;

public class StudentBST {
	 StudentNode root;

	    public StudentNode insert(StudentNode root, int rollNo, String name) {
	        if (root == null) {
	            return new StudentNode(rollNo, name);
	        }

	        if (rollNo < root.rollNo) {
	            root.left = insert(root.left, rollNo, name);
	        } else if (rollNo > root.rollNo) {
	            root.right = insert(root.right, rollNo, name);
	        }

	        return root;
	    }

	    public StudentNode search(StudentNode root, int rollNo) {
	        if (root == null || root.rollNo == rollNo) {
	            return root;
	        }

	        if (rollNo < root.rollNo) {
	            return search(root.left, rollNo);
	        }

	        return search(root.right, rollNo);
	    }

	    private StudentNode minValueNode(StudentNode node) {
	        StudentNode current = node;

	        while (current.left != null) {
	            current = current.left;
	        }

	        return current;
	    }

	    public StudentNode delete(StudentNode root, int rollNo) {
	        if (root == null) {
	            return root;
	        }

	        if (rollNo < root.rollNo) {
	            root.left = delete(root.left, rollNo);
	        } else if (rollNo > root.rollNo) {
	            root.right = delete(root.right, rollNo);
	        } else {

	            if (root.left == null) {
	                return root.right;
	            } else if (root.right == null) {
	                return root.left;
	            }

	            StudentNode successor = minValueNode(root.right);
	            root.rollNo = successor.rollNo;
	            root.name = successor.name;

	            root.right = delete(root.right, successor.rollNo);
	        }

	        return root;
	    }

	    public void inorder(StudentNode root) {
	        if (root != null) {
	            inorder(root.left);
	            System.out.println("Roll No : " + root.rollNo + " , Name : " + root.name);
	            inorder(root.right);
	        }
	    }

}
