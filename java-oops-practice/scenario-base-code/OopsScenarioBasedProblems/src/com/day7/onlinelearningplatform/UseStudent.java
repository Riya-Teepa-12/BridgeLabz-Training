package com.day7.onlinelearningplatform;

public class UseStudent {
   
	public static void main(String[] args) {

        Instructor instructor = new Instructor("Alice", "alice@skillforge.com");

        String[] modules = {"Java Basics", "OOP", "Collections", "Project"};
        Course course = new Course("Java Mastery", instructor, "Advanced", modules);

        instructor.uploadCourse(course);

        Student student = new Student("Bob", "bob@gmail.com");

        student.updateProgress(50);
        student.updateProgress(50);
        student.addScore(70);

        student.generateCertificate();

       
        CourseCertification.generate(student, course);
     }
	
 }
