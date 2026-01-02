package com.day1.universityenrollmentsystem;

public abstract class Student {
	
	 protected String studentId;
	    protected String name;
	    private double gpa;   // secured field

	    // Constructor without elective
	    public Student(String studentId, String name) {
	        this.studentId = studentId;
	        this.name = name;
	    }

	    // Constructor with elective preference
	    public Student(String studentId, String name, double gpa) {
	        this.studentId = studentId;
	        this.name = name;
	        this.gpa = gpa;
	    }

	    protected void updateGPA(double gpa) {
	        this.gpa = gpa;
	    }

	    public double getGPA() {
	        return gpa;
	    }

	    public String getTranscript() {
	        return "ID: " + studentId + ", Name: " + name + ", GPA: " + gpa;
	    }

}
