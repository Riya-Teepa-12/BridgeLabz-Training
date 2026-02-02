package com.streams.doctoravailability;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HospitalDoctorAvailability {
	public static void main(String[] args){
        List<Doctor> doctors=Arrays.asList(
            new Doctor("Dr. Amit","Cardiology",true),
            new Doctor("Dr. Neha","Neurology",false),
            new Doctor("Dr. Rahul","Orthopedic",true),
            new Doctor("Dr. Priya","Dermatology",true),
            new Doctor("Dr. Karan","Neurology",true)
        );

        doctors.stream().filter(d->d.isAvailableOnWeekend()).sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(System.out::println);
    }
}
