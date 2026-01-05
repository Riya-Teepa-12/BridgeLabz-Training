package com.day3.campusconnect;

import java.util.*;

public class Course {
   private String courseName;
   List<Student> list;
   private Faculty f;
   
   
   public Course(String courseName, Faculty faculty) {
       this.courseName = courseName;
       this.f = faculty;
          list = new ArrayList<>();
   }
   
   public void addStudent(Student s) {
       list.add(s);
   }

   public void removeStudent(Student s) {
       list.remove(s);
   }

   public void displayCourseDetails() {
       System.out.println("Course: " + courseName);
       System.out.println("Faculty: " + f.getName());
       System.out.println("Enrolled Students: " + list.size());
   }
}

