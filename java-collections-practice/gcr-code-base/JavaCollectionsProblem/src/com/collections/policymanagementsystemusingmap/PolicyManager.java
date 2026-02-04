package com.collections.policymanagementsystemusingmap;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> expiryDateMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        insertionOrderMap.put(policy.policyNumber, policy);

        expiryDateMap
                .computeIfAbsent(policy.expiryDate, k -> new ArrayList<>())
                .add(policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringInNext30Days() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Policy> result = new ArrayList<>();

        expiryDateMap.subMap(today, true, next30Days, true)
                     .values()
                     .forEach(result::addAll);

        return result;
    }

    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();

        for (Policy policy : policyMap.values()) {
            if (policy.policyHolderName.equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.expiryDate.isBefore(today)) {
                iterator.remove();
                insertionOrderMap.remove(policy.policyNumber);
                expiryDateMap.get(policy.expiryDate).remove(policy);
            }
        }
    }

    public void displayPoliciesInInsertionOrder() {
        insertionOrderMap.values().forEach(System.out::println);
    }
}