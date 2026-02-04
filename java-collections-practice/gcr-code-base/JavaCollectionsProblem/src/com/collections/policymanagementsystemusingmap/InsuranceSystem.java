package com.collections.policymanagementsystemusingmap;

import java.time.LocalDate;
import java.util.List;

public class InsuranceSystem {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P101", "Priya Sharma", LocalDate.now().plusDays(10), 5000));
        manager.addPolicy(new Policy("P102", "Iyra khan", LocalDate.now().plusDays(40), 8000));
        manager.addPolicy(new Policy("P103", "Piyush Jeeshan", LocalDate.now().minusDays(5), 6000));

        System.out.println("Retrieve policy by number");
        System.out.println(manager.getPolicyByNumber("P101"));

        System.out.println("Policies expiring in next 30 days");
        List<Policy> expiringPolicies = manager.getPoliciesExpiringInNext30Days();
        for (Policy policy : expiringPolicies) {
            System.out.println(policy);
        }

        System.out.println("Policies for Piyosh");
        List<Policy> piyoshPolicies = manager.getPoliciesByHolder("Piyosh");
        for (Policy policy : piyoshPolicies) {
            System.out.println(policy);
        }

        System.out.println("Removing expired policies");
        manager.removeExpiredPolicies();

        System.out.println("Policies in insertion order");
        manager.displayPoliciesInInsertionOrder();
    }
}
