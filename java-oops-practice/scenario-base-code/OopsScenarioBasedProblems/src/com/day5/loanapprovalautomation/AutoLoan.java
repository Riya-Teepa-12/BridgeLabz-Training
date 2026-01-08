package com.day5.loanapprovalautomation;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term);
        this.type = "Auto Loan";
        this.interestRate = 9.5;
    }

   
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 680) {
            setApproved(true);
            return true;
        }
        setApproved(false);
        return false;
    }

}
