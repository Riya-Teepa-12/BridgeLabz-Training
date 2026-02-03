package com.Day1.functionalinterface.consumerexamples;

import java.util.function.Consumer;

public class StudentConsumer {
    
	public static void main(String[] args) {

        Consumer<Student> printStudent =
                s -> System.out.println(
                        "Name: " + s.name + ", Age: " + s.age);

        Student student = new Student("Riya", 20);
        printStudent.accept(student);
    }
}
