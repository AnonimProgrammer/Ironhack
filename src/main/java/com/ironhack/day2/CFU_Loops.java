package com.ironhack.day2;

public class CFU_Loops {
    public static void main(String[] args) {
        // Exercise 1
        int[] numbers = {5, 4, 3, 2, 1};
        int first = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if ((i + 1) == numbers.length) {
                numbers[i] = numbers[i] * first;
                break;
            }
            numbers[i] = numbers[i] * numbers[i + 1];
        }

        // Exercise 2
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        for (int element : reversedArray) {
            System.out.print(element + " ");
        }
    }
}
