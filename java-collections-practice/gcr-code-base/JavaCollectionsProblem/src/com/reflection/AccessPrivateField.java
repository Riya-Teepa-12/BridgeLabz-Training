package com.reflection;

import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class AccessPrivateField {
	public static void main(String[] args) throws Exception {
        Person p = new Person(25);
        Class<?> cls = p.getClass();
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);
        int oldAge = (int) field.get(p);
        System.out.println("Original Age: " + oldAge);
        field.set(p, 30);
        int newAge = (int) field.get(p);
        System.out.println("Modified Age: " + newAge);
    }
}
