package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)         
@interface ImportantMethod {
    String level() default "HIGH";  
}


class TaskManagers1{

    @ImportantMethod
    public void criticalTask() {
        System.out.println("Executing critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void routineTask() {
        System.out.println("Executing routine task...");
    }

    public void normalTask() {
        System.out.println("Executing normal task...");
    }
}

public class UseTaskManager3 {
    public static void main(String[] args) throws Exception {
        TaskManagers1 manager = new TaskManagers1();
        manager.criticalTask();
        manager.routineTask();
        manager.normalTask();

        System.out.println("\nAnnotated Methods:");
        Method[] methods = TaskManagers1.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}
