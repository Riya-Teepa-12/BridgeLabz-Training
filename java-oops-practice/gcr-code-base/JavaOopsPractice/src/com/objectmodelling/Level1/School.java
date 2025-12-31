package com.objectmodelling.Level1;

import java.util.*;
public class School {

         //attributes
	private String schoolName;
         private List<Student> students = new ArrayList<>();
     
     //constructor
    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student); // aggregation
    }

     //method to show student details
    void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println(" Student: " + s.getName());
        }
    }
}
