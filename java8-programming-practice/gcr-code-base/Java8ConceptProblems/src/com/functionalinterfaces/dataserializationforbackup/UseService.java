package com.functionalinterfaces.dataserializationforbackup;

import java.util.Arrays;
import java.util.List;

public class UseService {
	public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Rahul");
        Employee emp2 = new Employee(102, "Anita");
        Customer cust1 = new Customer(201, "Suresh");

        List<Object> objects = Arrays.asList(emp1, emp2, cust1);

        BackupService.backupData(objects);
    }

}
