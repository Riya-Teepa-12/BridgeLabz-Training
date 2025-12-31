package com.objectmodelling.Level1;

public class UseStudentDemo {
	 public static void main(String[] args) {

	        StudentDemo s1 = new StudentDemo(1, "Amit");
	        StudentDemo s2 = new StudentDemo(2, "Neha");

	        Professor p1 = new Professor(101, "Dr. Sharma");

	        CourseDemo c1 = new CourseDemo(501, "Object Oriented Programming");

	        c1.assignProfessor(p1);

	        s1.enrollCourse(c1);
	        s2.enrollCourse(c1);

	        c1.showCourseDetails();
	    }
}
