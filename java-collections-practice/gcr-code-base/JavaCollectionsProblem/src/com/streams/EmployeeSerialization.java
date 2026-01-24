package com.streams;

import java.io.Serializable;
import java.util.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class Employee implements Serializable{
	
	private int id;
	private String name;
	private String Department;
	private double salary;
	
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		Department = department;
		this.salary = salary;
	}
	
	public String toString() {
        return "Employee [id=" + id +
               ", name=" + name +
               ", department=" + Department +
               ", salary=" + salary + "]";
    }
	
}


public class EmployeeSerialization {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\riya6\\OneDrive\\Desktop\\riya_teepa86.java";
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Riya", "IT", 55000));
        empList.add(new Employee(102, "Aman", "HR", 45000));
        empList.add(new Employee(103, "Neha", "Finance", 60000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(empList);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization");
            e.printStackTrace();
        }

       
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {

            List<Employee> employees = (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Data:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println("IO Error during deserialization");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
        }
    }
}
