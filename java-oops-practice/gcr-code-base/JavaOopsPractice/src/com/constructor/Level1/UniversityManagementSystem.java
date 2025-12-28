package com.constructor.Level1;

public class UniversityManagementSystem {
	 public static void main(String[] args) {

	        PostgraduateStudent ps = new PostgraduateStudent(
	                101,
	                "Prince",
	                 8.9,
	                "Computer Science"
	        );

	        ps.displayPGDetails();

	      
	        ps.setCGPA(9.2);
	        System.out.println("Updated CGPA: " + ps.getCGPA());
	    }

}
