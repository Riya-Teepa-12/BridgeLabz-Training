package com.day7.onlinelearningplatform;

public class CourseCertification {
   
	 public static void generate(Student student, Course course) {
	        if (course.getLevel().equalsIgnoreCase("Beginner")) {
	            System.out.println("Beginner Certificate issued to " + student.name);
	        } else {
	            System.out.println("Advanced Professional Certificate issued to " + student.name);
	        }
	    }
   }
