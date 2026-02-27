package com.ironhack.week2.day10;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.addItem("Laptop");
//        shoppingCart.addItem("Mouse");
//        shoppingCart.addItem("Keyboard");
//        shoppingCart.addItem("Mouse");
//        shoppingCart.addItem("Monitor");
//
//        shoppingCart.showCart();
//
//        shoppingCart.removeItem("Mouse");
//
//        shoppingCart.showCart();

        Account account1 = new Account(
                "John Doe",
                "123 Main Street, New York",
                1500.75,
                "ACC10001",
                Hold.NONE
        );

        Account account2 = new Account(
                "Alice Smith",
                "456 Elm Street, Los Angeles",
                3200.00,
                "ACC10002",
                Hold.FRAUD
        );

        Account account3 = new Account(
                "Bob Johnson",
                "789 Oak Avenue, Chicago",
                845.50,
                "ACC10003",
                Hold.DELINQUENCY
        );

        HashMap<String, Account> accounts = new HashMap<>();
        accounts.put(account1.getAccountNumber(), account1);
        accounts.put(account2.getAccountNumber(), account2);
        accounts.put(account3.getAccountNumber(), account3);

        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Account: " + accounts.get(account1.getAccountNumber()));
    }
}
