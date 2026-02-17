package com.ironhack.day1;

public class Conditionals {
    public static void main(String[] args) {
        int memberPoints = 1500;
        String tier;

        if (memberPoints >= 5000) {
            tier = "Gold";
        } else if (memberPoints >= 2000) {
            tier = "Silver";
        } else {
            tier = "Bronze";
        }
        System.out.println("Member tier: " + tier);

        int customerAge = 25;
        if (customerAge >= 18) {
            if (customerAge >= 25) {
                System.out.println("Customer has 15% discount.");
            } else if (customerAge >= 30) {
                System.out.println("Customer has 20% discount.");
            }
        }

        String weekday = "Tuesday";
        switch (weekday) {
            case "Monday" -> System.out.println("Start of the week!");
            case "Tuesday" -> System.out.println("Second day of the week!");
            case "Wednesday" -> System.out.println("Midweek!");
            case "Thursday" -> System.out.println("Almost there!");
            case "Friday" -> System.out.println("Almost weekend!");
            case "Saturday", "Sunday" -> System.out.println("Weekend!");
            default -> System.out.println("Invalid weekday!");
        }
    }
}
