package com.day1.universityenrollmentsystem;

public class UseStudent {
	  public static void main(String[] args) {

	        Student ug = new Undergraduate("U101", "Rahul", 7.5);
	        Student pg = new Postgraduate("P202", "Anita", 8.2);

	        Course java = new Course("CS101", "Java Programming");

	        Enrollment e1 = new Enrollment(ug, java);
	        Enrollment e2 = new Enrollment(pg, java);

	        Faculty faculty = new Faculty();

	        faculty.assignGrade("U101", "A");
	        e1.setGrade("A");

	        faculty.assignGrade("P202", "B");
	        e2.setGrade("B");

	        System.out.println(ug.getTranscript());
	        System.out.println(pg.getTranscript());
	    }

}
