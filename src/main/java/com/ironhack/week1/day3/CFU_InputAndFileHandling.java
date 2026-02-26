package com.ironhack.week1.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CFU_InputAndFileHandling {
    public static void main(String[] args) throws IOException {
        // Exercise 1
//        String text = readFromConsole();
//
//        int count = countWordsStartingWithVowels(text);
//        System.out.println("Number of words starting with a vowel: " + count);

        // Exercise 2
        File file = new File("oscar_age_female.csv");
        try (Scanner scanner = new Scanner(file)) {
            // Skip the header line
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String content = getString(row);
                fileWriter("result.txt", content);
            }
        }
    }

    private static String getString(String row) {
        String[] columns = row.split(",");
        String year = columns[1].trim();
        String age = columns[2].trim();
        String name = columns[3].trim().replace("\"", "");
        String movie = columns[4].trim().replace("\"", "");;

        return String.format("""
                Name: %s
                Year: %s
                Age: %s
                Movie: %s
                ===============
                """, name, year, age, movie);
    }

    public static void fileWriter(String filePath, String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(content);
        }
    }

    public static String readFromConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter some text:");
            return scanner.nextLine();
        }
    }

    public static int countWordsStartingWithVowels(String text) {
        String[] words = text.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.matches("^(?i)[aeiou].*")) {
                count++;
            } else {
                System.err.println("Error. Word does not start with a vowel: " + word);
            }
        }
        return count;
    }
}
