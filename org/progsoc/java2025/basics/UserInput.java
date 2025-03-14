package org.progsoc.java2025.basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String enteredText = scanner.nextLine();

        scanner.close();

        System.out.println("You have entered: " + enteredText);
    }
}
