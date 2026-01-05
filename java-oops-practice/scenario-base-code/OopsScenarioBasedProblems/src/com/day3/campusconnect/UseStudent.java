package com.day3.campusconnect;

import java.util.*;

public class UseStudent {
	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        Faculty faculty = new Faculty("Dr. Sharma", "sharma@college.edu",101, "Computer Science");

	        Course javaCourse = new Course("Java Programming", faculty);
	        Student student = new Student("Prince", "prince@student.edu",101);

	        System.out.print("Enter number of subjects: ");
	        int n = input.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter grade: ");
	            student.addGrade(input.nextInt());
	        }

	        student.enrollCourse(javaCourse);
	        Person p1 = student;
	        Person p2 = faculty;

	        System.out.println("\n--- Student Details ---");
	        p1.printDetails();

	        System.out.println("\n--- Faculty Details ---");
	        p2.printDetails();

	        System.out.println("\n--- Course Details ---");
	        javaCourse.displayCourseDetails();

	        input.close();

    }
	 
}
