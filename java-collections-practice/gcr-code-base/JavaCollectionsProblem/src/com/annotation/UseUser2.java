package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value(); 
}


class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }

    @RoleAllowed("USER")
    public void viewProfile() {
        System.out.println("Profile viewed successfully.");
    }

    public void publicMethod() {
        System.out.println("Public method executed.");
    }
}

class User3 {
    private String username;
    private String role;

    public User3(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }
}


public class UseUser2 {
    public static void main(String[] args) throws Exception {
        AdminService service = new AdminService();

        User3 admin = new User3("Alice", "ADMIN");
        User3 user = new User3("Bob", "USER");

        System.out.println("Trying as ADMIN:");
        invokeIfAllowed(service, "deleteUser", admin);  
        invokeIfAllowed(service, "viewProfile", admin); 

        System.out.println("\nTrying as USER:");
        invokeIfAllowed(service, "deleteUser", user);   
        invokeIfAllowed(service, "viewProfile", user);  

        System.out.println("\nPublic method:");
        invokeIfAllowed(service, "publicMethod", user); 
    }

 
    public static void invokeIfAllowed(Object obj, String methodName, User3 user) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (roleAllowed.value().equals(user.getRole())) {
                method.invoke(obj);
            } else {
                System.out.println("Access Denied for user '" + user.getUsername() + "' on method " + methodName);
            }
        } else {
            
            method.invoke(obj);
        }
    }
}
