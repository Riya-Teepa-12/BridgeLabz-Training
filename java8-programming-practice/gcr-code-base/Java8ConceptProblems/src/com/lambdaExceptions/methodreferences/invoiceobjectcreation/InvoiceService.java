package com.lambdaExceptions.methodreferences.invoiceobjectcreation;

import java.util.List;
import java.util.stream.Collectors;

public class InvoiceService {
	  public static List<Invoice> generateInvoices(List<Integer> transactionIds) {
		    // constructor reference
	        return transactionIds.stream().map(Invoice::new).collect(Collectors.toList());
	    }

}
