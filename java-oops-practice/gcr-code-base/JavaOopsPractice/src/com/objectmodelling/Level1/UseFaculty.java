package com.objectmodelling.Level1;

public class UseFaculty{
	 public static void main(String[] args) {

	        Faculty f1 = new Faculty("Dr. Sharma");
	        Faculty f2 = new Faculty("Dr. Mehta");

	        University uni = new University("National University");

	        uni.addDepartment("Computer Science");
	        uni.addDepartment("Mechanical");

	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        uni.showUniversity();

	      
	        uni.deleteUniversity();

	 
	        f1.showFaculty();
	        f2.showFaculty();
	    }
}
