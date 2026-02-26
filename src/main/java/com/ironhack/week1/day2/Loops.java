package com.ironhack.week1.day2;

public class Loops {
    public static void main(String[] args) {
        String[] dishes = {"Margarita Pizza", "Caesar Salad", "Grilled Salmon", "Tiramisu"};

//        System.out.println("First dish: " + dishes[0]);
//        System.out.println("Second dish: " + dishes[1]);
//        System.out.println("Third dish: " + dishes[2]);

        double[] prices = new double[4];
//        System.out.println("Default price: " + prices[0]); // -> 0.0

        prices[0] = 38.99;
        prices[1] = 15.99;
        prices[2] = 15.99;
        prices[3] = 26.50;

        for (int i = 0; i < dishes.length; i++) {
            System.out.println((i + 1) + ". " + dishes[i] + " - $" + prices[i]);
        }

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int element : array) {
            if (element % 2 == 0) {
                continue;
            } else if(element == 7) {
                break;
            }
//            System.out.print(element + " => ");
        }

        int i = 0;
        while (i < array.length) {
//            System.out.println(array[i]);
            i++;
        }
    }
}
