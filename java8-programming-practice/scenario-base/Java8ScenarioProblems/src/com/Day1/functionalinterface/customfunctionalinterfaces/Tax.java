package com.Day1.functionalinterface.customfunctionalinterfaces;

@FunctionalInterface
interface TaxCalculator {
    double calculate(double amount);
}

public class Tax {
    public static void main(String[] args) {

        TaxCalculator tax = amount -> amount * 0.18;

        System.out.println("Tax Amount: " +
                tax.calculate(100000));
    }
}
