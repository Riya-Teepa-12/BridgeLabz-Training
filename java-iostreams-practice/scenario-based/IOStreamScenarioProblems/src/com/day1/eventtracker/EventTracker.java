package com.day1.eventtracker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EventTracker {

    public static void trackEvents(Class<?> clazz) {

        List<AuditLog> logs = new ArrayList<>();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(AuditTrail.class)) {

                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                logs.add(new AuditLog(
                        method.getName(),
                        audit.action()
                ));
            }
        }

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println(gson.toJson(logs));
    }
}