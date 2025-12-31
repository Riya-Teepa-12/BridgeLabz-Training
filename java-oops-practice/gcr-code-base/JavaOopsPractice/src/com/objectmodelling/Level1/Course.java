package com.objectmodelling.Level1;


import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
    private List<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("  Student: " + s.getName());
        }
    }

    String getCourseName() {
        return courseName;
    }
}
