package com.collectionsGenerics.universitycoursemanagement;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research & Thesis");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through research work and thesis.");
    }

}
