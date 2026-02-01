package com.lambdaExceptions.methodreferences.nameuppercasing;

import java.util.ArrayList;
import java.util.List;

public class UseEmployee {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,"Rahul"));
        employees.add(new Employee(2,"Anita"));
        employees.add(new Employee(3,"Suresh"));

        List<String> uppercaseNames =
                EmployeeService.getUppercaseNames(employees);

        uppercaseNames.forEach(System.out::println);
    }

}
