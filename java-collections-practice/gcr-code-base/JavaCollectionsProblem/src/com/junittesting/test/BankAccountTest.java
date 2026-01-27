package com.junittesting.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junittesting.com.BankAccount;

public class BankAccountTest {
     
	// Test deposit
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
        
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    // Test withdraw
    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance());
        
        account.withdraw(150.0);
        assertEquals(0.0, account.getBalance());
    }

    // Test insufficient funds
    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(150.0);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    // Test negative deposit
    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50.0);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    // Test negative withdrawal
    @Test
    void testNegativeWithdrawal() {
        BankAccount account = new BankAccount(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-30.0);
        });
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }
}
