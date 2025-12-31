package com.objectmodelling.Level1;

import java.util.*;

public class Bank {
	    private String bankName;

	    public Bank(String bankName) {
	        this.bankName = bankName;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    // communication method
	    public void openAccount(Customer customer) {
	        customer.setBank(this);
	        customer.setBalance(5000);
	   
	   }
}


