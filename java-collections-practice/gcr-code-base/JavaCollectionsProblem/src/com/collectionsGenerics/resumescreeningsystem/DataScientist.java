package com.collectionsGenerics.resumescreeningsystem;

class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public void screenResume() {
        System.out.println("Checking Python, ML, Statistics, Data Analysis");
    }

}
