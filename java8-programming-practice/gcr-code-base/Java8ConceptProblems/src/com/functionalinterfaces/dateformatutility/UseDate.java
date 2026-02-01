package com.functionalinterfaces.dateformatutility;

import java.time.LocalDate;

public class UseDate {
	 public static void main(String[] args) {

	        LocalDate invoiceDate = LocalDate.now();

	        String format1 = DateUtils.formatDate(invoiceDate, "dd/MM/yyyy");
	        String format2 = DateUtils.formatDate(invoiceDate, "MMMM dd, yyyy");
	        String format3 = DateUtils.formatDate(invoiceDate, "yyyy-MM-dd");

	        System.out.println("Invoice date format 1: " + format1);
	        System.out.println("Invoice date format 2: " + format2);
	        System.out.println("Invoice date format 3: " + format3);
	    }

}
