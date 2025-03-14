package org.progsoc.java2025.demos;

public class GuessNumber {
    public static int getUserInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int enteredNumber = scanner.nextInt();
        scanner.close();

        if (enteredNumber < 1 || enteredNumber > 10) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
            System.exit(1);
        }

        return enteredNumber;
    }

    public static int getComputerNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    public static String determineWinner(int userNumber, int computerNumber) {
        if (userNumber == computerNumber) {
            return "It's a tie!";
        } else if (userNumber > computerNumber) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Please enter a number between 1 and 10: ");
        int userNumber = getUserInput();
        int computerNumber = getComputerNumber();
        System.out.println("Computer chose: " + computerNumber);
        System.out.println("You chose: " + userNumber);
        System.out.println("The winner is: " + determineWinner(userNumber, computerNumber));
    }
}
