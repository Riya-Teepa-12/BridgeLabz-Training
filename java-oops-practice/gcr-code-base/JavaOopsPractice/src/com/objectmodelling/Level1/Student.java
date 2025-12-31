package com.objectmodelling.Level1;

import java.util.ArrayList;
import java.util.List;

public class Student {

            //attributes
	  private String name;
	    private List<Course> courses = new ArrayList<>();


            //constructor
	    Student(String name) {
	        this.name = name;
	    }

	    void enrollCourse(Course course) {
	        courses.add(course);
	        course.addStudent(this); 	    }

	    void showCourses() {
	        System.out.println("Student: " + name);
	        for (Course c : courses) {
	            System.out.println("  Enrolled in: " + c.getCourseName());
	        }
	    }

	    String getName() {
	        return name;
	    }

}
