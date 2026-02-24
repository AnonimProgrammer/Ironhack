package com.ironhack.day7;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class CFU_JsonAndMaven {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Exercise 1
        String invoiceJson = """
                {
                  "id": "YMZ-0000001",
                  "total": 30.5,
                  "isPaid": false,
                  "invoiceItems": [
                    { "name": "Coca Cola 2L", "price": 10.0 },
                    { "name": "Rum Santa Teresa 0.7L", "price": 15.0 },
                    { "name": "Ice bag L", "price": 5.5 }
                  ]
                }
                """;
        Invoice invoice = gson.fromJson(invoiceJson, Invoice.class);
        System.out.println(invoice);

        // Exercise 2
        List<Book> books = List.of(
                new Book("The Raven", 50),
                new Book("The Black Cat", 60),
                new Book("The Tell-Tale Heart", 40)
        );
        Author author = new Author("Some", "Author", books);

        String authorJson = gson.toJson(author);
        System.out.println(authorJson);
    }
}
