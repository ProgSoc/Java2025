package org.progsoc.java2025.basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.print("What is your age? ");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine(); // to consume the newline character

        if (age >= 18) {
            System.out.println("You can legally drink!");
        } else if (age >= 14) {
            System.out.println("You can't legally drink, but you can legally work!");
        } else {
            System.out.println("You have no freedom");
        }

        scanner.close();
    }
}
