package com.Day9.universitydigitalrecordsystem;

public class StudentNode {

    int rollNo;
    String name;
    StudentNode left;
    StudentNode right;

    public StudentNode(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.left = null;
        this.right = null;
    }
}
