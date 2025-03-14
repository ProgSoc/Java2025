package org.progsoc.java2025.demos;

/**
 * A simple Rock, Paper, Scissors game that uses functions and takes user input
 * using scanner
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Please enter your choice (rock, paper, or scissors): ");
        String userChoice = getUserInput();
        String computerChoice = getComputerChoice();
        System.out.println("Computer chose: " + computerChoice);
        System.out.println("You chose: " + userChoice);
        System.out.println("The winner is: " + determineWinner(userChoice, computerChoice));
    }

    /**
     * Get user input using scanner
     * 
     * @return the user input (rock, paper, or scissors)
     */
    public static String getUserInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String enteredText = scanner.nextLine();
        scanner.close();

        if (!enteredText.equals("rock") && !enteredText.equals("paper") && !enteredText.equals("scissors")) {
            System.out.println("Invalid input. Please enter rock, paper, or scissors.");
            System.exit(1);
        }

        return enteredText;
    }

    /**
     * Get the computer's choice randomly
     * 
     * @return the computer's choice (rock, paper, or scissors)
     */
    public static String getComputerChoice() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            return "rock";
        } else if (random == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "You win!";
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You win!";
        } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
