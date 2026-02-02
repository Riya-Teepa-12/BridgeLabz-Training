package com.collectors.employeesalarycategorization;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Riya", "IT", 60000),
                new Employee("Aman", "HR", 45000),
                new Employee("Neha", "IT", 70000),
                new Employee("Rahul", "Finance", 80000),
                new Employee("Priya", "HR", 50000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        System.out.println(avgSalaryByDept);
    }

}
