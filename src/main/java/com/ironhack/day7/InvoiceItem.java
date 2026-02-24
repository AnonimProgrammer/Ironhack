package com.ironhack.day7;

import java.math.BigDecimal;

public class InvoiceItem {
    private String name;
    private BigDecimal price;

    public InvoiceItem(String name, BigDecimal price) {
        if (name == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        this.name = name;
        if (price == null) {
            throw new IllegalArgumentException("Price can not be null");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
