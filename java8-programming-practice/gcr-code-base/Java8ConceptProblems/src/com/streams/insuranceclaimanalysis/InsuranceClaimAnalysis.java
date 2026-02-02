package com.streams.insuranceclaimanalysis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
        
	public static void main(String[] args){
        List<InsuranceClaim> claims=Arrays.asList(
            new InsuranceClaim("Health",50000),
            new InsuranceClaim("Vehicle",30000),
            new InsuranceClaim("Health",70000),
            new InsuranceClaim("Life",100000),
            new InsuranceClaim("Vehicle",45000),
            new InsuranceClaim("Life",80000)
        );

        Map<String,Double> avgClaimByType=
            claims.stream()
                  .collect(Collectors.groupingBy(
                      InsuranceClaim::getClaimType,
                      Collectors.averagingDouble(InsuranceClaim::getAmount)
                  ));

        avgClaimByType.forEach((k,v)->System.out.println(k+" -> "+v));
    }
	   
}
