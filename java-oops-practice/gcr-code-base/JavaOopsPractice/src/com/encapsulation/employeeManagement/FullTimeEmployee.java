package com.encapsulation.employeeManagement;

public class FullTimeEmployee extends Employee {
          private String Department;
          
          public FullTimeEmployee(int employeeId, String name,double baseSalary) {
        	  super(employeeId,name,baseSalary);
    
          }
          
          public double calculateSalary() {
        	  return baseSalary;
          }
          
          
}
