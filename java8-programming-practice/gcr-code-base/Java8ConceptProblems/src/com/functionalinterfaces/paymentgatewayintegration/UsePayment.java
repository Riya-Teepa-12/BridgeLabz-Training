package com.functionalinterfaces.paymentgatewayintegration;

public class UsePayment {
	 public static void main(String[] args) {

	        PaymentProcessor paypal = new PayPalPayment();
	        PaymentProcessor card = new CreditCardPayment();

	        paypal.pay(2000);
	        paypal.refund(500);

	        card.pay(1500);
	        card.refund(300);
	    }

}
