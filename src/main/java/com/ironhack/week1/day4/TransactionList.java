package com.ironhack.week1.day4;

import java.util.Date;
import java.util.List;

public interface TransactionList {
    Transaction getLastTransaction();

    void addTransaction(Transaction transaction);

    Transaction getTransactionByDate(Date date);

    List<Transaction> getAllTransactions();
}
