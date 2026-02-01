package com.lambdaExceptions.methodreferences.invoiceobjectcreation;

import java.util.Arrays;
import java.util.List;

public class UseInvoice {
	 public static void main(String[] args) {

	        List<Integer> transactionIds =
	                Arrays.asList(5001, 5002, 5003, 5004);

	        List<Invoice> invoices =
	                InvoiceService.generateInvoices(transactionIds);

	        invoices.forEach(System.out::println);
	    }

}
