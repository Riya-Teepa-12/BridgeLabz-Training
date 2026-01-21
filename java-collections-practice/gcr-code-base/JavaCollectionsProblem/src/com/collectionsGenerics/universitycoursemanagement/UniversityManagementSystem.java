package com.collectionsGenerics.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class UniversityManagementSystem {
    
	public static void main(String[] args) {

        Course<ExamCourse> maths =
                new Course<>("MTH101", "Engineering Mathematics", new ExamCourse());

        Course<AssignmentCourse> java =
                new Course<>("CSE201", "Java Programming", new AssignmentCourse());

        Course<ResearchCourse> ai =
                new Course<>("CSE501", "AI Research", new ResearchCourse());

        maths.displayCourse();
        maths.conductEvaluation();

        java.displayCourse();
        java.conductEvaluation();

        ai.displayCourse();
        ai.conductEvaluation();

        System.out.println("\n---- University Evaluation Overview ----");

        List<CourseType> allCourseTypes = new ArrayList<>();
        allCourseTypes.add(new ExamCourse());
        allCourseTypes.add(new AssignmentCourse());
        allCourseTypes.add(new ResearchCourse());

        UniversityUtil.displayAllCourseTypes(allCourseTypes);
    }
}
