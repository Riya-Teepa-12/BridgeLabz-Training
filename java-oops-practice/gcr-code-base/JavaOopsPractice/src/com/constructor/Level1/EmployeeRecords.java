package com.constructor.Level1;

public class EmployeeRecords {
	
	public static void main(String[] args) {

        Manager mg = new Manager(
                701,
                "IT",
                85000.0,
                "Senior Manager"
        );

        mg.displayManagerDetails();

        //  private salary using public method
        mg.setSalary(82000.0);
        System.out.println("Updated Salary: " + mg.getSalary());
    }

}
