package com.day3.campusconnect;

import java.util.*;

public class Student extends Person implements ICourseActions{

    private ArrayList<Integer> grades; 
    private ArrayList<Course> courses;   
    
    
	 public Student(String name,  String email, int id) {
		super(name,email,id);
		 grades = new ArrayList<>();
	     courses = new ArrayList<>();
		
	 }
	 
	 public void addGrade(int grade) {
	        grades.add(grade);
	    }
	 public double calculateGPA(){
		 if(grades.isEmpty())
		 return 0.0;
		 int sum = 0;
	        for (int g : grades) {
	            sum += g;
	        }
	        return (double) sum / grades.size();
		 
	 }
	 
	 public void enrollCourse(Course course) {
		 courses.add(course);
		 System.out.println("Student succesfully enrolled");
	 }
	 public void dropCourse(Course course) {
		courses.remove(course);
	 }
	 public void printDetails() {
		 System.out.println("Student ID: " + getId());
	        System.out.println("Name: " + getName());
	        System.out.println("Email: " + getEmail());
	 }
     
}
