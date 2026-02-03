package com.Day1.lambdaexpressions;

import java.util.*;

class Student {
    private String name;
    private int age;
    private int marks;
    private int rank;

    public Student(String name, int age, int marks, int rank) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.rank = rank;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMarks() { return marks; }
    public int getRank() { return rank; }

    @Override
    public String toString() {
        return name + " | Age:" + age + " | Marks:" + marks + " | Rank:" + rank;
    }
}


public class StudentExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Riya", 20, 75, 2),
                new Student("Amit", 17, 30, 5),
                new Student("Neha", 22, 85, 1)
        );

        // 1. Welcome message
        students.forEach(s ->
                System.out.println("Welcome " + s.getName()));

        // 2. Pass / Fail
        students.forEach(s ->
                System.out.println(s.getName() + " Pass: " + (s.getMarks() >= 35)));

        // 3. Sort by name
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Sorted by Name: " + students);

        // 4. Sort by rank
        students.sort((s1, s2) -> s1.getRank() - s2.getRank());
        System.out.println("Sorted by Rank: " + students);

        // 5. Age above 18
        students.stream()
                .filter(s -> s.getAge() > 18)
                .forEach(System.out::println);
    }
}
