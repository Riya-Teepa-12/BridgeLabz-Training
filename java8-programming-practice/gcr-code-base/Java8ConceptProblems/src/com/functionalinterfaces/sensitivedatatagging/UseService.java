package com.functionalinterfaces.sensitivedatatagging;

import java.util.Arrays;
import java.util.List;

public class UseService {
	public static void main(String[] args) {

        Employee emp = new Employee(101, "Rahul", "123-45-6789");
        Customer cust = new Customer(201, "Suresh", "suresh@example.com");

        List<Object> objects = Arrays.asList(emp, cust);

        EncryptionService.processData(objects);
    }

}
