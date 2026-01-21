package com.collectionsGenerics.universitycoursemanagement;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Written Examination");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through final written exam.");
    }

}
