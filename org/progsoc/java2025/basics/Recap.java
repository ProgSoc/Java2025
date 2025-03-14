package org.progsoc.java2025.basics;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many numbers you want to check for odd or even: ");
        int numberOfLoops = scanner.nextInt();
        scanner.nextLine(); // to consume the newline character

        for (int i = 0; i < numberOfLoops; i++) {
            System.out.print("Please enter a number: ");

            int number = scanner.nextInt();
            scanner.nextLine(); // to consume the newline character

            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }

        scanner.close();
    }
}
