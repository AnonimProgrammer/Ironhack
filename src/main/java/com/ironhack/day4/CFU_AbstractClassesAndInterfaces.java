package com.ironhack.day4;

import java.util.Date;

public class CFU_AbstractClassesAndInterfaces {
    public static void main(String[] args) {
        PaymentList payments = new PaymentList();

        Date now = new Date();
        Transaction transaction1 = new Transaction(
                "SELL-001",
                "BUY-001",
                250.00,
                now);
        Transaction transaction2 = new Transaction(
                "SELL-002",
                "BUY-002",
                175.50,
                new Date(now.getTime() + 86400000));

        payments.addTransaction(transaction1);
        payments.addTransaction(transaction2);

        System.out.println("Last transaction: " + payments.getLastTransaction());
        System.out.println("Total transactions: " + payments.getAllTransactions().size());

        Transaction found = payments.getTransactionByDate(now);
        if (found != null) {
            System.out.println("Found transaction for today: " + found);
        }
    }
}
