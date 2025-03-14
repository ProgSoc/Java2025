package org.progsoc.java2025.basics;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt(); // Read an integer from the user
        scanner.nextLine(); // to consume the newline character

        scanner.close();

        // Print out the number that was entered
        System.out.println("You have entered " + number);
    }
}
