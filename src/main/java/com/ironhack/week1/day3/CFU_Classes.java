package com.ironhack.week1.day3;

public class CFU_Classes {
    public static void main(String[] args) {
        // Exercise 1
        Course course = new Course(
                "class107GKV",
                20,
                18,
                "Java"
        );

        // Exercise 2
        Invoice invoice = new Invoice(
                "INV-001",
                "Some description of the invoice",
                10,
                1.21
        );

        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());
    }
}
