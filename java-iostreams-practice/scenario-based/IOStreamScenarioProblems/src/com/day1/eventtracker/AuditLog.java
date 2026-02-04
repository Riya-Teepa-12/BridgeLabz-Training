package com.day1.eventtracker;

import java.time.LocalDateTime;

public class AuditLog {

    private String methodName;
    private String action;
    private String timestamp;

    public AuditLog(String methodName, String action) {
        this.methodName = methodName;
        this.action = action;
        this.timestamp = LocalDateTime.now().toString();
    }
}
