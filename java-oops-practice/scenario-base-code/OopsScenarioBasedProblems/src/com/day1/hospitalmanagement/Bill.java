package com.day1.hospitalmanagement;

public class Bill implements Payable {
    private double consultationFee;
    private double medicineCost;
    private double discount; 
    private double tax;      

    public Bill(double consultationFee, double medicineCost, double discount, double tax) {
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
        this.discount = discount;
        this.tax = tax;
    }

    
    public double calculatePayment() {
        double total = consultationFee + medicineCost;
        double discountAmount = total * (discount / 100);
        double taxAmount = (total - discountAmount) * (tax / 100);
        return total - discountAmount + taxAmount;
    }
	
	

}
