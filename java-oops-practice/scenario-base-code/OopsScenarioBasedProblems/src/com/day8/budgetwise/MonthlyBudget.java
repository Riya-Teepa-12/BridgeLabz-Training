package com.day8.budgetwise;

import java.util.HashMap;
import java.util.Map;

public class MonthlyBudget extends Budget {

    private String month;

    public MonthlyBudget(String month, double income,
                         Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
        this.month = month;
    }

  
    public void generateReport() {
        System.out.println("Monthly Report: " + month);
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Savings: " + calculateNetSavings());
    }

  
    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : getTransactions()) {
            if ("EXPENSE".equalsIgnoreCase(t.getType())) {
                spent.put(
                        t.getCategory(),
                        spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }

        for (String category : spent.keySet()) {
            if (spent.get(category) >
                    categoryLimits.getOrDefault(category, 0.0)) {
                System.out.println("Overspend in category: " + category);
            }
        }
    }

}
