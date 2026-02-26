package com.ironhack.week2.day8.simple_junit;

public class CreditCard {
    private final double BALANCE_LIMIT = 1000;
    protected double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public void addBalance(double amount) {
        if (balance + amount < BALANCE_LIMIT) {
            balance += amount;
        }
    }

    public double getBalanceLimit() {
        return BALANCE_LIMIT;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isLowBalance() {
        return balance < BALANCE_LIMIT * 0.1;
    }
}
