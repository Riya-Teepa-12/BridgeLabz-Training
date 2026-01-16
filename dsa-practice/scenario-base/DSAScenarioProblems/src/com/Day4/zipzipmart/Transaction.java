package com.Day4.zipzipmart;

public class Transaction {
	
	 String date;   // format: YYYY-MM-DD
	    double amount;
	    int id;        // to show stability

	    Transaction(int id, String date, double amount) {
	        this.id = id;
	        this.date = date;
	        this.amount = amount;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Date: " + date + ", Amount: " + amount;
	    }

}
