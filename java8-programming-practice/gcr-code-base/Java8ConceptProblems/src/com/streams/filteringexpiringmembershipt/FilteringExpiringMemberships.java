package com.streams.filteringexpiringmembershipt;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FilteringExpiringMemberships {
	public static void main(String[] args){
        List<GymMember> members=Arrays.asList(
            new GymMember("Amit",LocalDate.now().plusDays(10)),
            new GymMember("Neha",LocalDate.now().plusDays(40)),
            new GymMember("Rahul",LocalDate.now().plusDays(25)),
            new GymMember("Priya",LocalDate.now().plusDays(5))
        );

        LocalDate today=LocalDate.now();
        LocalDate next30Days=today.plusDays(30);

        members.stream().filter(m->!m.getExpiryDate().isBefore(today)
                       && !m.getExpiryDate().isAfter(next30Days))
               .forEach(System.out::println);
    }
}
