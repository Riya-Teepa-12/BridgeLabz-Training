package com.lambdaExceptions.methodreferences.nameuppercasing;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	 public static List<String> getUppercaseNames(List<Employee> employees) {

	        return employees.stream().map(Employee::getName).map(String::toUpperCase).collect(Collectors.toList());
	    }

}
