package com.encapsulation.hospitalpatientmanagement;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }


    public double calculateBill() {
        return consultationFee;
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
