package com.ironhack.day1;

public class DataTypes {
    public static void main(String[] args) {
//        Exercise 1
        int valueInt = 28;
        String valueString = "Java";
        double valueDouble = 23.63;

        System.out.println("Value int: " + valueInt);
        System.out.println("Value String: " + valueString);
        System.out.println("Value double: " + valueDouble);

//        Exercise 2
        int variable = 10;
        boolean isOdd = variable % 2 != 0;

        if (isOdd) {
            System.out.println(variable + " is odd.");
        } else {
            System.out.println(variable + " is even.");
        }

//        Exercise 3
        int num1 = 15;
        int num2 = 13;
        int num3 = 17;

        int smallest = num1;
        if (smallest > num2) {
            smallest = num2;
        }
        if (smallest > num3) {
            smallest = num3;
        }
        System.out.println("The smallest number is: " + smallest);

//        Exercise 4
        String productName = "  Apple iPhone 14 Pro Max  ";
        String date = "2024-06-01";

        System.out.println(productFormatter(productName, date));
    }

    private static String productFormatter(String productName, String date) {
       return productName
                .trim()
                .toUpperCase()
                .replace(" ", "_")
                .concat("_" + date);
    }
}
