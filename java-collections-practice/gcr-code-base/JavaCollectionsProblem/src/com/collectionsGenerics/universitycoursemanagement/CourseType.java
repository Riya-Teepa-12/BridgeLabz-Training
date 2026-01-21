package com.collectionsGenerics.universitycoursemanagement;

public abstract class CourseType {
       
	 protected String evaluationMethod;

	    public CourseType(String evaluationMethod) {
	        this.evaluationMethod = evaluationMethod;
	    }

	    public String getEvaluationMethod() {
	        return evaluationMethod;
	    }

	   
	    public abstract void evaluate();
}
