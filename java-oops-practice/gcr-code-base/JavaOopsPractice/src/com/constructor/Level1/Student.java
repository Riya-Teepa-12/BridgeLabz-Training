package com.constructor.Level1;

public class Student {
   
	 // Access Modifiers
    public int rollNumber;     
    protected String name;       
    private double CGPA;         

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

   
    public double getCGPA() {
        return CGPA;
    }

   
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
	
	
	
	
	
}

