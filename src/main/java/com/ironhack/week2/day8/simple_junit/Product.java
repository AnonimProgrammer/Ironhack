package com.ironhack.week2.day8.simple_junit;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void restock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Restock quantity must be positive");
        }
        stock += quantity;
    }

    public void sell(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Sell quantity must be positive");
        }
        if (quantity > stock) {
            throw new IllegalArgumentException("Not enough stock");
        }
        stock -= quantity;
    }

    public boolean isInStock() {
        return stock > 0;
    }

    public double getInventoryValue() {
        return price * stock;
    }
}
