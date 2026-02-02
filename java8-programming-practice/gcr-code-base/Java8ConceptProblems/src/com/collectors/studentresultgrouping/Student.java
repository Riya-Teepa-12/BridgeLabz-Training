package com.collectors.studentresultgrouping;

public class Student {
	String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    String getName() {
        return name;
    }

    String getGrade() {
        return grade;
    }
}
