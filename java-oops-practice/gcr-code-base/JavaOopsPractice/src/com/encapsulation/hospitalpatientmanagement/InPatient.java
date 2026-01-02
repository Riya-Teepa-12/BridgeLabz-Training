package com.encapsulation.hospitalpatientmanagement;

public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age,
                     int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }


    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

 
    public void addRecord(String diagnosis, String history) {
        setDiagnosis(diagnosis);
        setMedicalHistory(history);
    }

   
    public void viewRecords() {
        System.out.println("Diagnosis       : " + getDiagnosis());
        System.out.println("Medical History : " + getMedicalHistory());
    }

}
