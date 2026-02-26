package com.ironhack.week1.day2;

public class Methods {
    public static void main(String[] args) {
        int sum = sum(5, 3);

//        System.out.println("The result: " + result);
//
//        greet("Omar");

        int radius = 4;
        double area = calculateCircleArea(radius);
//        System.out.println("Area: " + area);

        int[] nums = {1, 2, 3, 4, 5};
//        System.out.println("Sum: " + sum(nums));
//        System.out.println("Max: " + max(nums));
//        System.out.println("Min: " + min(nums));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static double calculateCircleArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
