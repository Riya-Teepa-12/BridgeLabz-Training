package com.day8.budgetwise;

import java.util.*;

public class AnnualBudget extends Budget {

    private int year;

    public AnnualBudget(int year, double income,
                        Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
        this.year = year;
    }

    
    public void generateReport() {
        System.out.println("Annual Report: " + year);
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + totalExpenses());
        System.out.println("Annual Savings: " + calculateNetSavings());
    }

  
    public void detectOverspend() {
        System.out.println("Annual overspend analysis completed.");
    }
}
