package com.ironhack.day4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentList implements TransactionList{
    private List<Transaction> transactions = new ArrayList<>();

    @Override
    public Transaction getLastTransaction() {
        return transactions.getLast();
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public Transaction getTransactionByDate(Date date) {
        for (Transaction transaction : transactions) {
            if (transaction.getDate().equals(date)) {
                return transaction;
            }
        }
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}
