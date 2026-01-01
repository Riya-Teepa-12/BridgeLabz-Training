package com.inheritance.hierarchical.schoolsystem;

public class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Grade: " + grade);
    }

}
