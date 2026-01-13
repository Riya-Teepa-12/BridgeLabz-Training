package com.day8.budgetwise;

import java.util.*;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected Map<String, Double> categoryLimits;
    private List<Transaction> transactions; // encapsulated

    public Budget(double income, Map<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Controlled modification
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double totalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if ("EXPENSE".equalsIgnoreCase(t.getType())) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Operator usage
    public double calculateNetSavings() {
        return income - totalExpenses();
    }

    protected List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

}
