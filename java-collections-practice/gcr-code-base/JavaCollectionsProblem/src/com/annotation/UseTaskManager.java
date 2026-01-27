package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)        
@interface TaskInfo {
 String priority();  
 String assignedTo(); 
}


class TaskManager {

 @TaskInfo(priority = "High", assignedTo = "Alice")
 public void completeTask() {
     System.out.println("Completing the task...");
 }

 @TaskInfo(priority = "Low", assignedTo = "Bob")
 public void reviewTask() {
     System.out.println("Reviewing the task...");
 }
}


public class UseTaskManager{
 public static void main(String[] args) throws Exception {
     TaskManager manager = new TaskManager();
     manager.completeTask();
     manager.reviewTask();

     
     Method[] methods = TaskManager.class.getDeclaredMethods();
     for (Method method : methods) {
         if (method.isAnnotationPresent(TaskInfo.class)) {
             TaskInfo info = method.getAnnotation(TaskInfo.class);
             System.out.println("Method: " + method.getName());
             System.out.println("Priority: " + info.priority());
             System.out.println("Assigned To: " + info.assignedTo());
             System.out.println("--------------------------");
         }
     }
 }
}