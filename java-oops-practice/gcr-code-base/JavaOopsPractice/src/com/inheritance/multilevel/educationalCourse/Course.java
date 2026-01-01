package com.inheritance.multilevel.educationalCourse;

public class Course {

	 String courseName;
	    int duration; // in weeks

	    Course(String courseName, int duration) {
	        this.courseName = courseName;
	        this.duration = duration;
	    }

	    void displayCourseInfo() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + duration + " weeks");
	    }
}
