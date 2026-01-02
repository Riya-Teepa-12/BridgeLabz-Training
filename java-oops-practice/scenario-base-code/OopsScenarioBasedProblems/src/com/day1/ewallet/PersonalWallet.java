package com.day1.ewallet;

public class PersonalWallet extends Wallet {

    public PersonalWallet(boolean referral) {
        super(referral ? 100 : 0); 
    }

   
    public void transferTo(User receiver, double amount) {
        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Sent", amount));
            receiver.getWallet().history.add(new Transaction("Received", amount));
        } else {
            System.out.println("Insufficient balance");
        }
    }

}
