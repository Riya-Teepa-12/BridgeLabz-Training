package com.objectmodelling.Level1;

public class UseCompany {
	   public static void main(String[] args) {
	Company company = new Company("TechCorp");

    company.addDepartment("IT");
    company.addDepartment("HR");

    company.addEmployeeToDepartment(0, "Rohan");
    company.addEmployeeToDepartment(0, "Aman");
    company.addEmployeeToDepartment(1, "Neha");

    company.showCompany();

    
    company.deleteCompany();
  }
}
