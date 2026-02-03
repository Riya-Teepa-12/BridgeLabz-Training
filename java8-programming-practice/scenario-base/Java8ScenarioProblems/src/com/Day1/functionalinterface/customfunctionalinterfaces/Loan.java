package com.Day1.functionalinterface.customfunctionalinterfaces;

@FunctionalInterface
interface LoanEligibility {
    boolean check(double income);
}

public class Loan {
    public static void main(String[] args) {

        LoanEligibility eligible =
                income -> income >= 30000;

        System.out.println("Loan Eligible: " +
                eligible.check(45000));
    }
}
