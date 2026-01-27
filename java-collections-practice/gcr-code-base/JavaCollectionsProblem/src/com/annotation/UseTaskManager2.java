package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class) 
@interface BugReport {
    String description();
}


class TaskManagers {

    @BugReport(description = "NullPointerException occurs on line 42")
    @BugReport(description = "Fails when input list is empty")
    public void processTask() {
        System.out.println("Processing task...");
    }
}

public class UseTaskManager2 {
    public static void main(String[] args) throws Exception {
        TaskManagers manager = new TaskManagers();
        manager.processTask();

        Method method = TaskManagers.class.getMethod("processTask");

        
        BugReport[] reports = method.getAnnotationsByType(BugReport.class);
        System.out.println("Bug Reports for method: " + method.getName());
        for (BugReport report : reports) {
            System.out.println("- " + report.description());
        }
    }
}

