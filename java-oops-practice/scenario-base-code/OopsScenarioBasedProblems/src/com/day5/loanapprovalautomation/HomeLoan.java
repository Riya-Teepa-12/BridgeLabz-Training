package com.day5.loanapprovalautomation;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term);
        this.type = "Home Loan";
        this.interestRate = 8.5;
    }

    
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700) {
            setApproved(true);
            return true;
        }
        setApproved(false);
        return false;
    }

}
