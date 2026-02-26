package com.ironhack.week2.day9;

public class StringConverter {
    public static Integer convertToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
