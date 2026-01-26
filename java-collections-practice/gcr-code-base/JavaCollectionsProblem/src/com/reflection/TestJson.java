package com.reflection;

import java.lang.reflect.Field;

class Employee {
    private int id;
    private String name;
    private double salary;
    private boolean active;

    public Employee(int id, String name, double salary, boolean active) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.active = active;
    }
}
class JsonGenerator{
	public static String toJson(Object obj) {

        if (obj == null) {
            return "null";
        }

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder json = new StringBuilder();
        json.append("{");

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            try {
                json.append("\"").append(field.getName()).append("\":");

                Object value = field.get(obj);

                if (value == null) {
                    json.append("null");
                } else if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        json.append("}");
        return json.toString();
    }
}
 public class TestJson{

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Prince", 55000.50, true);

        String json = JsonGenerator.toJson(emp);
        System.out.println(json);
    }
}

