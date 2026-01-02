package com.day1.ewallet;

public class UseUser {
	 public static void main(String[] args) {

	        User alice = new User("Alice", new PersonalWallet(true));
	        User bob = new User("Bob", new BusinessWallet());

	        alice.getWallet().addBalance(500);
	        alice.getWallet().transferTo(bob, 200);

	        System.out.println("Alice Balance: ₹" + alice.getWallet().getBalance());
	        System.out.println("Bob Balance: ₹" + bob.getWallet().getBalance());

	        System.out.println("\nAlice Transactions:");
	        alice.getWallet().showHistory();
	    }

}
