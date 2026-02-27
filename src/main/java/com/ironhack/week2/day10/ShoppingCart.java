package com.ironhack.week2.day10;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        if (items.contains(item)) {
            System.out.println("Item already in cart: " + item);
        } else {
            items.add(item);
            System.out.println("Added: " + item);
        }
    }

    public void removeItem(String item) {
        items.remove(item);
        System.out.println("Removed: " + item);
    }

    public void showCart() {
        System.out.println("Shopping cart: ");
        items.forEach(System.out::println);
        System.out.println("======================\nTotal count: " + items.size());
    }
}
