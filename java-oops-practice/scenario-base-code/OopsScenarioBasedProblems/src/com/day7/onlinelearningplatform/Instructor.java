package com.day7.onlinelearningplatform;

public class Instructor extends User {

    public Instructor(String name, String email) {
        super(name, email);
    }

    public void uploadCourse(Course course) {
        System.out.println("Instructor " + name + " uploaded course: " + course.getTitle());
    }

}
