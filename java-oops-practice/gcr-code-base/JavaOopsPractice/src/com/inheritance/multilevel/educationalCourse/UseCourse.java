package com.inheritance.multilevel.educationalCourse;

public class UseCourse {

	 public static void main(String[] args) {
	        PaidOnlineCourse course = new PaidOnlineCourse(
	                "Java Full Stack",
	                12,
	                "Udemy",
	                true,
	                5000,
	                20
	        );

	        course.displayPaymentDetails();
	    }
}
