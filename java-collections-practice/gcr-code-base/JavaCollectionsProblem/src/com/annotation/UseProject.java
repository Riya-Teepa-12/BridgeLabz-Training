package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)         
@interface Todo {
    String task();               
    String assignedTo();       
    String priority() default "MEDIUM"; 
}


class Project {

    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {
        System.out.println("Login feature not yet implemented.");
    }

    @Todo(task = "Add password reset", assignedTo = "Bob")
    public void resetPassword() {
        System.out.println("Password reset feature pending.");
    }

    public void dashboard() {
        System.out.println("Dashboard feature completed.");
    }

    @Todo(task = "Integrate email notifications", assignedTo = "Charlie", priority = "LOW")
    public void emailNotifications() {
        System.out.println("Email notifications pending.");
    }
}


public class UseProject {

	 public static void main(String[] args) throws Exception {
	        Project project = new Project();
	        project.login();
	        project.resetPassword();
	        project.dashboard();
	        project.emailNotifications();

	        System.out.println("\nPending Tasks:");
	        Method[] methods = Project.class.getDeclaredMethods();
	        for (Method method : methods) {
	            if (method.isAnnotationPresent(Todo.class)) {
	                Todo todo = method.getAnnotation(Todo.class);
	                System.out.println("Method: " + method.getName());
	                System.out.println("Task: " + todo.task());
	                System.out.println("Assigned To: " + todo.assignedTo());
	                System.out.println("Priority: " + todo.priority());
	                System.out.println("--------------------------");
	            }
	        }
	    }

}
