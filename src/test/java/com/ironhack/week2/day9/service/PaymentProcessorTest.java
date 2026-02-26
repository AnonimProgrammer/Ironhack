package com.ironhack.week2.day9.service;

import com.ironhack.week2.day9.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {

    private PaymentProcessor paymentProcessor;
    private Account buyer;
    private Account seller;

    @BeforeEach
    void setUp() {
        paymentProcessor = new PaymentProcessor();
        buyer = new Account();
        buyer.setBalance(200);
        seller = new Account();
        seller.setBalance(200);
    }

    // processTaxExemptPurchase

    @Test
    void processTaxExemptPurchase_success() {
        paymentProcessor.processTaxExemptPurchase(buyer, seller, 200);
        assertEquals(0, buyer.getBalance());
        assertEquals(400, seller.getBalance());
    }

    @Test
    void processTaxExemptPurchase_invalidAmount_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> paymentProcessor.processTaxExemptPurchase(buyer, seller, -1));;
    }

    @Test
    void processTaxExemptPurchase_invalidBalance_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> paymentProcessor.processTaxExemptPurchase(buyer, seller, 300));
    }

    // processTaxedPurchase

    @Test
    void processTaxedPurchase_success() {
        paymentProcessor.processTaxedPurchase(buyer, seller, 100);
        assertEquals(86, buyer.getBalance(), 0.1);
        assertEquals(300, seller.getBalance());
    }

    @Test
    void processTaxedPurchase_invalidAmount_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> paymentProcessor.processTaxedPurchase(buyer, seller, -1));
    }

    @Test
    void processTaxedPurchase_invalidBalance_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> paymentProcessor.processTaxedPurchase(buyer, seller, 300));
    }

    // issueRefund

    @Test
    void issueRefund_success() {
        paymentProcessor.issueRefund(buyer, seller, 100, 7);
        assertEquals(207, buyer.getBalance());
        assertEquals(193, seller.getBalance());
    }

    @Test
    void issueRefund_invalidAmount_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> paymentProcessor.issueRefund(buyer, seller, -1, 7));
    }

    @Test
    void issueRefund_invalidPercentage_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> paymentProcessor.issueRefund(buyer, seller, 100, 101));
    }
}