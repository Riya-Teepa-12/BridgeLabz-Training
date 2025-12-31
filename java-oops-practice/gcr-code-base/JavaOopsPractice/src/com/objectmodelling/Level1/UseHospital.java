package com.objectmodelling.Level1;

public class UseHospital {
    public static void main(String []args) {
    	 Hospital hospital = new Hospital("Chandak Hospital");

         Doctor d1 = new Doctor("Dr. Rk");
         Doctor d2 = new Doctor("Dr. Mehta");

         Patient p1 = new Patient("Mehal");
         Patient p2 = new Patient("Zara");

         hospital.addDoctor(d1);
         hospital.addDoctor(d2);

         hospital.addPatient(p1);
         hospital.addPatient(p2);

         hospital.showHospitalInfo();

         d1.consult(p1);
         d1.consult(p2);

         d2.consult(p1);
     }
    
}
