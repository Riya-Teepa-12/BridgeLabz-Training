package com.objectmodelling.Level1;
import java.util.*;
public class Department {

            //attributes
	    private String deptName;
	    private List<Employee> employees = new ArrayList<>();
             
            //constructor
	    Department(String deptName) {
	        this.deptName = deptName;
	    }

	    void addEmployee(String empName) {
	        employees.add(new Employee(empName));
	    }

	    void showDepartment() {
	        System.out.println(" Department: " + deptName);
	        for (Employee e : employees) {
	            e.showEmployee();
	        }
	    }

	    void deleteDepartment() {
	        employees.clear(); 
	    }
}
