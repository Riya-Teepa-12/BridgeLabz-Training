package com.inheritance.employeemanagement;

public class Manager extends Employee {
	 private int teamsize;
	 
	 
	 public Manager(String name,int id,double salary,int teamsize) {
	    	super(name,id,salary);
	    	this.teamsize=teamsize;
	    }
     
	 public void displayDetails() {
		  super.displayDetails();
		 System.out.println("Team Size :" + teamsize);
	 }

	
}
