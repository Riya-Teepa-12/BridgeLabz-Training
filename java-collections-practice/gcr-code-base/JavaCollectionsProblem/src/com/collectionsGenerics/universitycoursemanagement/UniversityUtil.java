package com.collectionsGenerics.universitycoursemanagement;

import java.util.List;


public class UniversityUtil {
     
	 public static void displayAllCourseTypes(List<? extends CourseType> courses) {
	        for (CourseType course : courses) {
	            System.out.println("Evaluation Type: " + course.getEvaluationMethod());
	            course.evaluate();
	        }
	    }
}
