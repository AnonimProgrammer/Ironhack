package com.ironhack.day1;

public class FoundationalDataTypes {
    public static void main(String[] args) {
        String result = "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(", ");
        }
        result = sb.toString();

        System.out.println("Result: " + result);
    }
}