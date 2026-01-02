package com.day1.universityenrollmentsystem;

public class Faculty implements Graded {

   
    public void assignGrade(String studentId, String grade) {
        System.out.println("Grade " + grade + " assigned to Student ID: " + studentId);
    }

}
