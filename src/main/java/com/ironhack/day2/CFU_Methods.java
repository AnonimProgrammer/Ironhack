package com.ironhack.day2;

public class CFU_Methods {
    public static void main(String[] args) {
        // Exercise 1
        greet("Omar");

        // Exercise 2
        double area = calculateArea(5.5, 3.2);

        // Exercise 3
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Sum: " + sumArray(numbers));

        // Exercise 4
        int[] numbers2 = {45, 12, 78, 34, 89, 23};
        System.out.println("Max: " + findMax(numbers2));

        // Bonus: FizzBuzz
        fizzBuzz(15);
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static double calculateArea(double width, double height) {
        double area = width * height;
        System.out.println("Area: " + area);

        return area;
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
