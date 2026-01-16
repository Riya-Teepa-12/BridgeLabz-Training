package com.Day4.zipzipmart;

import java.util.Scanner;
public class ZipZapMart {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        Transaction[] transactions = new Transaction[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Transaction " + (i + 1));

            System.out.print("Transaction ID: ");
            int id = sc.nextInt();

            System.out.print("Transaction Date (YYYY-MM-DD): ");
            String date = sc.next();

            System.out.print("Transaction Amount: ");
            double amount = sc.nextDouble();

            transactions[i] = new Transaction(id, date, amount);
        }

        System.out.println("\nBefore Sorting:");
        for (Transaction t : transactions)
            System.out.println(t);

        MergeSort.mergeSort(transactions, 0, transactions.length - 1);

        System.out.println("\nAfter Sorting (by Date, then Amount):");
        for (Transaction t : transactions)
            System.out.println(t);

        sc.close();
    }
}
