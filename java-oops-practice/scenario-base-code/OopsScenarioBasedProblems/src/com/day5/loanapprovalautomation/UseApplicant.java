package com.day5.loanapprovalautomation;

import java.util.*;

public class UseApplicant {
	 public static void main(String[] args) {
           Scanner kb = new Scanner(System.in);
		   System.out.println("Enter Your details");
		   System.out.println("Enter your name:");
		   String name=kb.next();
		   System.out.println("Enter your credit score");
		   int n = kb.nextInt();
		   System.out.println("Enter your income");
		   double d = kb.nextDouble();
		   System.out.println("Enter you loan Amount");
		   double ds=kb.nextDouble();
		   
	        Applicant applicant = new Applicant(name,n,d,ds);
	        System.out.println("Enter the year: ");
	        int term = kb.nextInt();
	        LoanApplication loan = new HomeLoan(applicant, term);

	        if (loan.approveLoan()) {
	            System.out.println("Loan Approved");
	            System.out.println("EMI: " + loan.calculateEMI());
	        } else {
	            System.out.println("Loan Rejected");
	        }
	 }
}
