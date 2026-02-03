package com.Day1.optionalclassexamples.studentmanagement;

import java.util.*;

import java.util.Optional;

class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String nickName;

    public Student(int id, String name, String email,
                   String phone, String address, String nickName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public Optional<String> getPhone() {
        return Optional.ofNullable(phone);
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    public Optional<String> getNickName() {
        return Optional.ofNullable(nickName);
    }
}

public class StudentOptionalExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Riya", "riya@gmail.com",
                        null, "Pune", "Rii"),
                new Student(2, "Amit", null,
                        "9999999999", null, null)
        );

        // 1. Safely fetch email
        students.forEach(s ->
                System.out.println("Email: " +
                        s.getEmail().orElse("Email not available")));

        // 2. Default phone number
        students.forEach(s ->
                System.out.println("Phone: " +
                        s.getPhone().orElse("0000000000")));

        // 3. Find student by ID
        int searchId = 3;
        Optional<Student> foundStudent = students.stream()
                .filter(s -> s.getId() == searchId)
                .findFirst();

        System.out.println(foundStudent
                .map(st -> "Student Found: " + st.getName())
                .orElse("Student not available"));

        // 4. Fetch address safely
        students.forEach(s ->
                System.out.println("Address: " +
                        s.getAddress().orElse("Address not available")));

        // 5. Nickname if present else real name
        students.forEach(s ->
                System.out.println("Display Name: " +
                        s.getNickName().orElse(s.getName())));
    }
}
