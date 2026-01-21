package com.Day9.medwarehouse;

import java.time.LocalDate;
import java.util.*;

public class MedWarehouse {
    
	public static void main(String []args) {
		MedicineDetails md = new MedicineDetails("TAZ-OL",LocalDate.of(2004, 11, 12));
		MedicineDetails md1 = new MedicineDetails("AZ-LC",LocalDate.of(2005, 10, 11));
		MedicineDetails md2 = new MedicineDetails("Z-CC",LocalDate.of(2006, 9, 10));
		MedicineDetails md3 = new MedicineDetails("FZ-CC",LocalDate.of(2007, 10, 10));
		List<MedicineDetails> list = new ArrayList<>();
		  list.add(md);
		  list.add(md1);
		  list.add(md2);
		  list.add(md3);
		MedicineDetails jd = new MedicineDetails("OL-BD",LocalDate.of(2008, 11, 12));
		  MedicineDetails jd1 = new MedicineDetails("JD-LC",LocalDate.of(2018, 12, 11));
		  MedicineDetails jd2 = new MedicineDetails("OPQ-CC",LocalDate.of(2020, 9, 10));
		  MedicineDetails jd3 = new MedicineDetails("JCD-CC",LocalDate.of(2022, 4, 10));
		  List<MedicineDetails> list1 = new ArrayList<>();
		  list.add(jd);
		  list.add(jd1);
		  list.add(jd2);
		  list.add(jd3); 
		  List<MedicineDetails> result = MedicineMergeSort.mergeSortedLists(list,list1);
		   System.out.println("Merged & Sorted Medicines by Expiry:");
	        for(int i=0;i<result.size();i++) {
	        	System.out.println(result.get(i).getMedicineName()+" -> "+result.get(i).getExpiryDate()+" Will get Expired"+(i+1));
	        }
	}
}
