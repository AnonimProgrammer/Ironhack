package com.ironhack.week2.day10;

import java.util.ArrayList;
import java.util.List;

public class CityManager {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(List.of("Lisbon", "Berlin", "Tokyo", "New York", "Sydney"));

        cities.forEach(System.out::println);

        cities.remove("Berlin");
        System.out.println(cities.size());

        System.out.println("Is Tokyo in list? " + (cities.contains("Tokyo") ? "Yes" : "No"));
    }
}
