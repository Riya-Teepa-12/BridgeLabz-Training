package com.objectmodelling.Level1;
import java.util.*;
public class Company {
	private String companyName;
    private List<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addEmployeeToDepartment(int deptIndex, String empName) {
        departments.get(deptIndex).addEmployee(empName);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }

    void deleteCompany() {
        for (Department d : departments) {
            d.deleteDepartment();
        }
        departments.clear(); // departments destroyed with company
        System.out.println("Company deleted along with all departments and employees.");
    }
}
