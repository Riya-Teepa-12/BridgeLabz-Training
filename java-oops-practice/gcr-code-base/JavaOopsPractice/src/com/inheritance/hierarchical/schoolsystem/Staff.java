package com.inheritance.hierarchical.schoolsystem;

public class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Department: " + department);
    }

}
