package com.ironhack.week1.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputAndFileHandling {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter your name: ");
            String name = scanner.next();
            System.out.println("Hello " + name);

            System.out.print("Now enter your age: ");
            int age = scanner.nextInt();

            String accessStatus = "DENIED";
            if (age >= 18) {
                accessStatus = "GRANTED";
                System.out.println("Welcome to the app!");
            } else {
                System.err.println("Access forbidden.");
            }

            String filePath = "output.txt";
            String content = "Name: " + name + "\nAge: " + age + "\nAccess: " + accessStatus;

            fileWriter(filePath, content);
            readFile(filePath);
        }
    }

    public static void fileWriter(String filePath, String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(content);
        }
    }

    public static void readFile(String filePath) throws IOException {
        File file = new File(filePath);
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        }
    }
}
