package com.collections.policymanagementsystemusingset;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("\nAll Unique Policies:");
        hashSet.forEach(System.out::println);
    }

    public void policiesExpiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        System.out.println("\nPolicies Expiring Within 30 Days:");
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isBefore(now) &&
                !p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    public void policiesByCoverage(String coverage) {
        System.out.println("\nPolicies with Coverage: " + coverage);
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }
    }

    public void findDuplicatePolicies(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");
        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                System.out.println(p);
            }
        }
    }

    public void performanceTest(Policy testPolicy) {

        System.out.println("\nPerformance Comparison (ns)");

        long start, end;

        // HashSet
        start = System.nanoTime();
        hashSet.contains(testPolicy);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start));

        // LinkedHashSet
        start = System.nanoTime();
        linkedHashSet.contains(testPolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search: " + (end - start));

        // TreeSet
        start = System.nanoTime();
        treeSet.contains(testPolicy);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start));
    }
}