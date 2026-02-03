package com.Day1.functionalinterface.customfunctionalinterfaces;

@FunctionalInterface
interface BonusCalculator {
    double calculate(double salary);
}

public class Bonus {
    public static void main(String[] args) {

        BonusCalculator bonus = salary -> salary * 0.10;

        System.out.println("Bonus: " + bonus.calculate(50000));
    }
}
