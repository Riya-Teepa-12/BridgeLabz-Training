package com.constructor.Level1;

public class Course{
	
	//attributes
	
	private String courseName;
	private int duration;
	private double fee;
	
	//static variable
	static String instituteName="Technocrats Institude";
	
	
	
	public Course(String courseName, int duration, double fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}

	//Methods to display course Details
	public void displayCourseDetails() {
		 System.out.println("Institute Name: " + instituteName);
	        System.out.println("Course Name   : " + courseName);
	        System.out.println("Duration      : " + duration + " months");
	        System.out.println("Fee           : ₹" + fee);
	        System.out.println("----------------------------");
		
	}
	
	
	//method to update Institute name
	public static void updateInstituteName(String nInstituteName) {
		instituteName = nInstituteName;

	}
	
	public static void main(String []args) {
		
		//creating class object 
		Course course = new Course("Computer Science", 4,50000);
		Course course1 = new Course("Data Science", 4,90000);
		course.displayCourseDetails();
		course1.displayCourseDetails();
		
		
		//calling the methods
		Course.updateInstituteName("XYZ Tech Academy");

        course.displayCourseDetails();
        course1.displayCourseDetails();
	}

}
