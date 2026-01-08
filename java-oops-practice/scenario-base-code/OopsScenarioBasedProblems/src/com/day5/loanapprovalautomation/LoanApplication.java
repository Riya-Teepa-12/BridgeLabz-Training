package com.day5.loanapprovalautomation;

public class LoanApplication implements IApprovable{
    
	//attributes
	protected double interestRate;
	protected int term;
	protected String type;
    protected Applicant applicant;

    private boolean approved; 
    
    public LoanApplication(Applicant applicant, int term) {
        this.applicant = applicant;
        this.term = term;
        this.type = "Personal Loan";
        this.interestRate = 12.0;
    }

    protected void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }
	public boolean approveLoan() {
		 if (applicant.getCreditScore() >= 650 &&
		            applicant.getIncome() * 20 >= applicant.getLoanAmount()) {
		            setApproved(true);
		            return true;
		        }
		        setApproved(false);
		        return false;
	}
    public double calculateEMI() {
    	 double P = applicant.getLoanAmount();
         double R = interestRate / 12 / 100;
         int N = term;

         return (P * R * Math.pow(1 + R, N)) /
                (Math.pow(1 + R, N) - 1);
     }
    
  }
	

