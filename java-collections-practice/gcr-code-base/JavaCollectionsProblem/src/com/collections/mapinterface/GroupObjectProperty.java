package com.collections.mapinterface;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupObjectProperty {
    public static void main(String []args) {
    	 List<Employee> employees = new ArrayList<>();
         employees.add(new Employee("Alice", "HR"));
         employees.add(new Employee("Bob", "IT"));
         employees.add(new Employee("Carol", "HR"));

         Map<String, List<Employee>> map = new HashMap<>();

         for (Employee e : employees) {
             if (map.containsKey(e.department)) {
                 map.get(e.department).add(e);
             } else {
                 List<Employee> list = new ArrayList<>();
                 list.add(e);
                 map.put(e.department, list);
             }
         }

         System.out.println(map);
     }
  }

