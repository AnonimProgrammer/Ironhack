package com.ironhack.week2.day8.simple_junit;

import com.ironhack.week2.day8.simple_junit.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    private CreditCard card;

    @BeforeEach
    void setUp() {
        card = new CreditCard(100);
    }

    // addBalance

    @Test
    void addBalance_normalAmount_balanceIncreases() {
        card.addBalance(200);
        assertEquals(300, card.getBalance());
    }

    @Test
    void addBalance_exceedsLimit_balanceUnchanged() {
        card.addBalance(1000);
        assertEquals(100, card.getBalance());
    }

    @Test
    void addBalance_exactlyAtLimit_balanceUnchanged() {
        card.addBalance(900);
        assertEquals(100, card.getBalance());
    }

    @Test
    void addBalance_resultAboveZero_balanceIsPositive() {
        card.addBalance(50);
        assertTrue(card.getBalance() > 0);
        assertFalse((card.getBalance() < 0));
    }

    // getBalance

    @Test
    void getBalance_afterConstruction_returnsInitialBalance() {
        assertEquals(100, card.getBalance());
    }

    // getBalanceLimit

    @Test
    void getBalanceLimit_returnsLimit() {
        assertEquals(1000, card.getBalanceLimit());
    }

    // isLowBalance

    @Test
    void isLowBalance_below10Percent_returnsTrue() {
        CreditCard card = new CreditCard(50);
        assertTrue(card.isLowBalance());
    }

    @Test
    void isLowBalance_wellAboveThreshold_returnsFalse() {
        CreditCard card = new CreditCard(5000);
        assertFalse(card.isLowBalance());
    }
}