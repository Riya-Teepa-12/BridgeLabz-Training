package com.Day1.lambdaexpressions;

import java.util.*;

class Employee {
    private String name;
    private double salary;
    private int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getExperience() { return experience; }

    @Override
    public String toString() {
        return name + " | Salary:" + salary + " | Exp:" + experience;
    }
}


public class EmployeeExample {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 50000, 5),
                new Employee("Ankit", 25000, 2),
                new Employee("Sneha", 70000, 4)
        );

        // 1. Bonus
        employees.forEach(e ->
                System.out.println(e.getName() + " Bonus: " +
                        (e.getSalary() > 30000 ? e.getSalary() * 0.10 : 0)));

        // 2. Sort by salary
        employees.sort((e1, e2) ->
                Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(employees);

        // 3. Promotion eligibility
        employees.forEach(e ->
                System.out.println(e.getName() + " Promotion: " +
                        (e.getExperience() > 3)));

        // 4. Print details
        employees.forEach(System.out::println);

        // 5. Compare salaries
        Comparator<Employee> salaryCompare =
                (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
        System.out.println(salaryCompare.compare(employees.get(0), employees.get(1)));
    }
}

