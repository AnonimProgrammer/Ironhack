package com.ironhack.week2.day9.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
        account.setName("ACC-191");
        account.setAddress("ADDRESS-191");
    }

    @Test
    void equals_success() {
        Account account1 = new Account();
        account1.setName("ACC-191");
        account1.setAddress("ADDRESS-191");

        assertEquals(account, account1);
    }

    @Test
    void equals_fail() {
        Account account1 = new Account();
        account1.setName("ACC-191");
        account1.setAddress("ADDRESS-101");

        assertNotEquals(account, account1);
    }

    @Test
    void hashCode_success() {
        Account account1 = new Account();
        account1.setName("ACC-191");
        account1.setAddress("ADDRESS-191");

        assertEquals(account1.hashCode(), account.hashCode());
    }

    @Test
    void hashCode_fail() {
        Account account1 = new Account();
        account1.setName("ACC-191");
        account1.setAddress("ADDRESS-101");

        assertNotEquals(account1.hashCode(), account.hashCode());
    }
}