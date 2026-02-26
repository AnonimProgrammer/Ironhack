package com.ironhack.week2.day9.service;

import com.ironhack.week2.day9.model.Account;

public class PaymentProcessor {
    public void processTaxExemptPurchase(Account buyer, Account seller, double purchaseAmount) {
        validateAmount(purchaseAmount);
        validateBalance(buyer.getBalance(), purchaseAmount);

        buyer.setBalance(buyer.getBalance() - purchaseAmount);
        seller.setBalance(seller.getBalance() + purchaseAmount);
    }

    public void processTaxedPurchase(Account buyer, Account seller, double purchaseAmount) {
        validateAmount(purchaseAmount);

        double taxedAmount = purchaseAmount * 1.14;
        validateBalance(buyer.getBalance(), taxedAmount);

        buyer.setBalance(buyer.getBalance() - taxedAmount);
        seller.setBalance(seller.getBalance() + purchaseAmount);
    }

    public void issueRefund(Account buyer, Account seller, double purchaseAmount, double percent) {
        validateAmount(purchaseAmount);
        validateRefundPercentage(percent);

        double refundAmount = purchaseAmount * percent/100;
        buyer.setBalance(buyer.getBalance() + refundAmount);
        seller.setBalance(seller.getBalance() - refundAmount);
    }

    private void validateAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Purchase amount must be greater than or equal to 0.");
        }
    }

    private void validateRefundPercentage(double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Refund percentage must be between 0 and 100.");
        }
    }

    private void validateBalance(double balance, double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
    }
}
