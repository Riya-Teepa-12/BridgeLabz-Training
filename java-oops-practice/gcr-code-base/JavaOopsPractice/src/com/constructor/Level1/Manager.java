package com.constructor.Level1;

public class Manager extends Employee {
     
	private String managerLl;
	
	public Manager(int employeeID,  String department,double salary,String managerL1) {
		super(employeeID , department, salary);
		this.managerLl =managerL1;
	}
	
	  public void displayManagerDetails() {
	        System.out.println("Manager Details:");
	        System.out.println("Employee ID (Public): " + employeeID);
	        System.out.println("Department (Protected): " + department);
	        System.out.println("Salary (via public method): " + getSalary());
	        System.out.println("Manager Level: " + managerLl);
	    }
}
