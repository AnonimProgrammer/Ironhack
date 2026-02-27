package com.ironhack.week2.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class UniqueNameFinder {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "Alice", "Diana", "Bob", "Eve", "Charlie", "Alice"));

        ArrayList<String> uniqueNames = toUniqueList(names);
        Collections.sort(uniqueNames);

        System.out.println("Duplicates removed: " + (names.size() - uniqueNames.size()));
        uniqueNames.forEach(System.out::println);
    }

    public static ArrayList<String> toUniqueList(ArrayList<String> names) {
        HashSet<String> uniqueNames = new HashSet<>(names);
        return new ArrayList<>(uniqueNames);
    }
}
