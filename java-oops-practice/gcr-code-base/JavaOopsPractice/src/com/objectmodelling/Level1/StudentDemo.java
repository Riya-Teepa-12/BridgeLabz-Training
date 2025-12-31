package com.objectmodelling.Level1;

public class StudentDemo {
         
        //attributes
	 private int studentId;
	    private String name;

           //constructor
	    public StudentDemo(int studentId, String name) {
	        this.studentId = studentId;
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void enrollCourse(CourseDemo course) {
	        course.addStudent(this);
	    }
}
