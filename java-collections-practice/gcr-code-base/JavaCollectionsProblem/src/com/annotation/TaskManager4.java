package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)         
@interface LogExecutionTime {
}


class TaskManager2{

    @LogExecutionTime
    public void fastTask() throws InterruptedException {
        Thread.sleep(100); 
        System.out.println("Fast task completed.");
    }

    @LogExecutionTime
    public void slowTask() throws InterruptedException {
        Thread.sleep(300);
        System.out.println("Slow task completed.");
    }

    public void normalTask() throws InterruptedException {
        Thread.sleep(200); // Not annotated
        System.out.println("Normal task completed.");
    }
}

public class TaskManager4 {
    public static void main(String[] args) throws Exception {
        TaskManager2 manager = new TaskManager2();
        Method[] methods = TaskManager2.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime(); 
                method.invoke(manager);            
                long endTime = System.nanoTime(); 
                long duration = endTime - startTime;
                System.out.println("Execution time of " + method.getName() + ": " + duration + " ns");
                System.out.println("--------------------------");
            }
        }

     
        manager.normalTask(); // No logging here
    }
}

