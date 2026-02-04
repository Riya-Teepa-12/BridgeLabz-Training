package com.day1.eventtracker;

public class UserActions {

    @AuditTrail(action = "User Login")
    public void login() {
        System.out.println("Login successful");
    }

    @AuditTrail(action = "File Upload")
    public void upload() {
        System.out.println("File uploaded");
    }

    public void viewProfile() {
        System.out.println("Profile viewed");
    }
}