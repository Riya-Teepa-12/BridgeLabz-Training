package com.Day1.operationonstudent;

import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String name;
    private int age;
    private String gender;
    private String city;
    private String department;
    private int rank;
    private List<String> contacts;

    public Student(int id, String firstName, String name, int age, String gender,
                   String city, String department, int rank, List<String> contacts) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.department = department;
        this.rank = rank;
        this.contacts = contacts;
    }

    // Getters
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCity() { return city; }
    public String getDepartment() { return department; }
    public int getRank() { return rank; }
    public List<String> getContacts() { return contacts; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}
