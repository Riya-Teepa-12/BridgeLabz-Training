package com.Day1.optionalclassexamples.bankingapplication;

public class BankingApp {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                null,
                new Nominee("Riya"),
                new CreditCard("1234-5678-9012")
        );

        Customer customer = new Customer(
                "Prince",
                new Loan("Home Loan", 500000),
                account
        );

        // 1. Nominee details
        customer.getAccount()
                .getNominee()
                .ifPresent(n -> System.out.println("Nominee: " + n.getName()));

        // 2. Loan details
        customer.getLoan()
                .ifPresent(l -> System.out.println(
                        l.getLoanType() + " - " + l.getLoanAmount()
                ));

        // 3. Balance or minimum balance
        double balance = customer.getAccount()
                .getBalance()
                .orElse(1000.0);
        System.out.println("Balance: " + balance);

        // 4. Transaction reference number
        Transaction txn = new Transaction(null);
        String ref = txn.getReferenceNumber()
                .orElse("REF_NOT_FOUND");
        System.out.println("Transaction Ref: " + ref);

        // 5. Credit card details
        customer.getAccount()
                .getCreditCard()
                .ifPresent(card ->
                        System.out.println("Card No: " + card.getCardNumber())
                );
    }
}
