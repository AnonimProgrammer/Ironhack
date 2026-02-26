package com.ironhack.week2.day8.simple_junit;

import com.ironhack.week2.day8.simple_junit.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100);
    }

    // withdraw

    @Test
    void withdraw_sufficientBalance_balanceDecreases() {
        account.withdraw(10);
        assertEquals(90,  account.getBalance());
    }

    @Test
    void withdraw_exactBalance_balanceZero() {
        account.withdraw(100);
        assertEquals(0,  account.getBalance());
    }

    @Test
    void withdraw_insufficientBalance_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(110));
    }

    // constructor

    @Test
    void construction_invalidBalance_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount(-1));
    }

    // getBalance

    @Test
    void getBalance_afterConstruction_returnsInitialBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }
}