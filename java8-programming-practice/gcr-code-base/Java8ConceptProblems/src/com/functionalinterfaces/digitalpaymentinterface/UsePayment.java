package com.functionalinterfaces.digitalpaymentinterface;

public class UsePayment {
	 public static void main(String[] args) {

	        Payment upi = new UPIPayment();
	        Payment card = new CreditCardPayment();
	        Payment wallet = new WalletPayment();

	        upi.pay(1500);
	        card.pay(3200);
	        wallet.pay(500);
	    }
}
