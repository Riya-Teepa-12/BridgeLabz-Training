package com.collectionsGenerics.universitycoursemanagement;

public class Course<T extends CourseType> {
	 private String courseCode;
	    private String courseName;
	    private T courseType;

	    public Course(String courseCode, String courseName, T courseType) {
	        this.courseCode = courseCode;
	        this.courseName = courseName;
	        this.courseType = courseType;
	    }

	    public T getCourseType() {
	        return courseType;
	    }

	    public void displayCourse() {
	        System.out.println("Course Code: " + courseCode +
	                ", Name: " + courseName +
	                ", Evaluation: " + courseType.getEvaluationMethod());
	    }

	    public void conductEvaluation() {
	        courseType.evaluate();
	    }
}
