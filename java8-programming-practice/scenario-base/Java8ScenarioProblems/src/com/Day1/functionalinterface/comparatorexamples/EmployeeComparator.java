package com.Day1.functionalinterface.comparatorexamples;

import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeComparator {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 50000),
                new Employee("Sneha", 70000)
        );

        employees.sort(Comparator.comparingDouble(e -> e.salary));

        employees.forEach(e ->
                System.out.println(e.name + " - Salary: " + e.salary));
    }
}
