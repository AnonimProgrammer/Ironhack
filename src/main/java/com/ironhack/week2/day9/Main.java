package com.ironhack.week2.day9;

public class Main {
    public static void main(String[] args) {
        String firstName = null;
        String lastName = "Doe";

        try {
            System.out.println(concat(firstName, lastName));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String concat(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("INVALID_ARGUMENT. First name and last name cannot be null");
        }
        return firstName + " " + lastName;
    }
}
