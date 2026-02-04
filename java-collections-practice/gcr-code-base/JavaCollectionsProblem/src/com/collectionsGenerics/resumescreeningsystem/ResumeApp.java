package com.collectionsGenerics.resumescreeningsystem;

import java.util.Arrays;
import java.util.List;

public class ResumeApp {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Alice", new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Bob", new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Charlie", new ProductManager());

        r1.processResume();
        r2.processResume();
        r3.processResume();

        ResumeValidator.validate(r1);

        List<JobRole> roles = Arrays.asList(
                new SoftwareEngineer(),
                new DataScientist(),
                new ProductManager()
        );

        ScreeningPipeline.runPipeline(roles);
    }
}