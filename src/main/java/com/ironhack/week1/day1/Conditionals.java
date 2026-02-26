package com.ironhack.week1.day1;

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

        String randomVeryLongString = "adbadadjadadk-adadj01et78t-981301u3uqiodhalk.djald";
        randomVeryLongString = randomVeryLongString.replace('-', '+');
//        System.out.println(randomVeryLongString.substring(10, 25));

        String amount = "100.50$";
//        System.out.println(amount.replace("$", "USD"));

        String formattedString = String.format("The member has %d points and is in the %s tier.", memberPoints, tier);
//        System.out.println(formattedString);

        String[] drinks = {"Latte", "Espresso", "Cappuccino"};
        for (int i = 0; i < drinks.length; i++) {
            String result = String.format("%d. %s", i + 1, drinks[i]);
            System.out.println(result);
        }

        StringBuilder sb = new StringBuilder("woem");
        System.out.println(sb.reverse());
    }
}
