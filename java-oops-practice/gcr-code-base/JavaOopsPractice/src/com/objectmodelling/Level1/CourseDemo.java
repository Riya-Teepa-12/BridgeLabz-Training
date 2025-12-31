package com.objectmodelling.Level1;

import java.util.*;

public class CourseDemo {
        
	 private int courseId;
	    private String courseName;
	    private Professor professor;
	    private List<StudentDemo> students;

	    public CourseDemo(int courseId, String courseName) {
	        this.courseId = courseId;
	        this.courseName = courseName;
	        this.students = new ArrayList<>();
	    }

	    public void assignProfessor(Professor professor) {
	        this.professor = professor;
	        System.out.println(professor.getName() + " assigned to " + courseName);
	    }

	    public void addStudent(StudentDemo student) {
	        students.add(student);
	        System.out.println(student.getName() + " enrolled in " + courseName);
	    }

	    public void showCourseDetails() {
	        System.out.println("\nCourse: " + courseName);
	        if (professor != null) {
	            System.out.println("Professor: " + professor.getName());
	        }
	        System.out.println("Enrolled Students:");
	        for (StudentDemo s : students) {
	            System.out.println("- " + s.getName());
	        }
	    }
}
