package com.ironhack.day4;

import java.util.Date;

public class Transaction {
    private String sellerAccountNumber;
    private String buyerAccountNumber;
    private double amount;
    private Date date;

    public Transaction(String sellerAccountNumber, String buyerAccountNumber, double amount, Date date) {
        setSellerAccountNumber(sellerAccountNumber);
        setBuyerAccountNumber(buyerAccountNumber);
        setAmount(amount);
        setDate(date);
    }

    public String getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(String sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public String getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public void setBuyerAccountNumber(String buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sellerAccountNumber='" + sellerAccountNumber + '\'' +
                ", buyerAccountNumber='" + buyerAccountNumber + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
