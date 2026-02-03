package com.Day1.optionalclassexamples.employeemanagementsystem;

import java.util.*;

import java.util.Optional;


public class EmployeeOptionalExample {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Riya", null, "Sharma",
                        "riya@gmail.com", "Amit",
                        5000.0, "Health Insurance"),

                new Employee(2, "Rahul", "Kumar", "Singh",
                        "rahul@gmail.com", null,
                        null, null)
        );

        // 1. Fetch manager details safely
        employees.forEach(e ->
                System.out.println("Manager: " +
                        e.getManager().orElse("Manager not assigned")));

        // 2. Fetch bonus (default 0)
        employees.forEach(e ->
                System.out.println("Bonus: " +
                        e.getBonus().orElse(0.0)));

        // 3. Find employee by email or throw exception
        String searchEmail = "abc@gmail.com";

        Employee emp = employees.stream()
                .filter(e -> e.getEmail().equals(searchEmail))
                .findFirst()
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee not found"));

        System.out.println("Found: " + emp);

        // 4. Get insurance details safely
        employees.forEach(e ->
                System.out.println("Insurance: " +
                        e.getInsurance().orElse("No Insurance")));

        // 5. Display middle name if present
        employees.forEach(e ->
                e.getMiddleName()
                        .ifPresent(m -> System.out.println("Middle Name: " + m)));
    }
}
