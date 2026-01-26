package com.reflection;

import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class CreateObjectDynamically {
	public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.reflection.Student");
        Object obj1 = cls.getDeclaredConstructor().newInstance();
        Student s1 = (Student) obj1;
        s1.display();
        
        Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
        Object obj2 = constructor.newInstance("Prince", 22);
        Student s2 = (Student) obj2;
        s2.display();
    }
}
