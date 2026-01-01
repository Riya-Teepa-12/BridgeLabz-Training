package com.inheritance.hierarchical.schoolsystem;

public class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Subject: " + subject);
    }

}
