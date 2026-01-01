package com.inheritance.employeemanagement;

public class Intern extends Employee{
    public Intern(String name,int id,double salary) {
    	super(name,id,salary);
    	
    }
    public void displayDetails() {
		  super.displayDetails();
	 }
    
}
