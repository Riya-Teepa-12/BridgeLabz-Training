package com.day3.campusconnect;

public class Faculty extends Person{
	   private String department;

	    public Faculty(String name, String email,int id, String department) {
	        super(name, email,id);
	        this.department = department;
	    }

	    public void printDetails() {
	        System.out.println("Faculty ID: " + getId());
	        System.out.println("Name: " + getName());
	        System.out.println("Email: " + getEmail());
	        System.out.println("Department: " + department);
	    }
	    
}
