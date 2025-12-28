package com.constructor.Level1;

public class Employee {
   
	//attributes
	
	public int employeeID;
	protected String department;
	private double salary;
	
	//getter
	public double getSalary() {
		return salary;
	}
	
	//setter
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int employeeID, String department, double salary) {
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	
	
}
