package com.encapsulation.employeeManagement;
import java.util.*;

public class UseEmployee {
	public static void main(String []args) {
		    List<Employee> employees = new ArrayList<>();

	        Employee emp1 = new FullTimeEmployee(101, "Priya", 50000);
	        emp1.assignDepartment("IT");

	        Employee emp2 = new PartTimeEmployee(102, "Riya", 80, 500);
	        emp2.assignDepartment("HR");

	        employees.add(emp1);
	        employees.add(emp2);

	        // Polymorphism: Employee reference calling overridden methods
	        for (Employee emp : employees) {
	            emp.displayDetails();
	        }
	    }
	}
