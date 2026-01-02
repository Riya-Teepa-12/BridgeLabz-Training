package com.day1.universityenrollmentsystem;

public class Enrollment {
	 private Student student;
	    private Course course;
	    private String grade;

	    public Enrollment(Student student, Course course) {
	        this.student = student;
	        this.course = course;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	        calculateGPA();
	    }

	    private void calculateGPA() {
	        double points = 0;

	        if (grade.equals("A")) points = 10;
	        else if (grade.equals("B")) points = 8;
	        else if (grade.equals("C")) points = 6;

	        student.updateGPA((student.getGPA() + points) / 2);
	    }

}
