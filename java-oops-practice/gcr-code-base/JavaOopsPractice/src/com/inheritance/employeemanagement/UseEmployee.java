package com.inheritance.employeemanagement;

public class UseEmployee {
	public static void main(String []args) {
		Employee e = new Developer("Arjun",125,50000,"Java");
		 System.out.println("Developer Details:");
		  System.out.println("-----------------------------");
		  e.displayDetails();
		  System.out.println("-----------------------------");
		   e = new Intern("Jiya",194,30000);
		 System.out.println("Intern Details:");
		  System.out.println("-----------------------------");
		 e.displayDetails();
		 System.out.println("-----------------------------");
		  e = new Manager("Harshit Mishra",189,100000,5);
		 System.out.println("Manager Details:");
		  System.out.println("-----------------------------");
		 e.displayDetails();
		 
		  
		  
	}

}
