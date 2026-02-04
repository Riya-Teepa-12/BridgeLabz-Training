package com.collectionsGenerics.resumescreeningsystem;

import java.util.List;

class ScreeningPipeline {

    public static void runPipeline(List<? extends JobRole> roles) {
        System.out.println("Running AI Screening Pipeline...");
        for (JobRole role : roles) {
            System.out.println("Role: " + role.getRoleName());
            role.screenResume();
        }
        System.out.println();
    }
}