package com.Day10.hospitalmanagement;

public class UseHospital {
	public static void main(String[] args) {

        HospitalAVL hospital = new HospitalAVL();

        hospital.registerPatient(930, "Ravi");
        hospital.registerPatient(945, "Anita");
        hospital.registerPatient(900, "Suresh");
        hospital.registerPatient(1015, "Meena");

        System.out.println("Patients by Arrival Time:");
        hospital.displayPatients();

        System.out.println("\nDischarging Anita...");
        hospital.dischargePatient(945);

        System.out.println("Updated Patient List:");
        hospital.displayPatients();
    }
}
