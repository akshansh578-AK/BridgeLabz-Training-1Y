package com.gla.string;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine();

        String normalizedUser = normalizeChoice(userChoice);
        if (normalizedUser == null) {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        String computerChoice = getComputerChoice();
        System.out.println("Computer choice: " + computerChoice);

        String result = determineWinner(normalizedUser, computerChoice);
        System.out.println(result);
        scanner.close();
    }

    private static String normalizeChoice(String input) {
        if (input == null) {
            return null;
        }
        String value = input.trim().toLowerCase();
        if (value.equals("rock") || value.equals("paper") || value.equals("scissors")) {
            return value;
        }
        return null;
    }

    private static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }

    private static String determineWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "It is a tie.";
        }
        if ((user.equals("rock") && computer.equals("scissors"))
                || (user.equals("paper") && computer.equals("rock"))
                || (user.equals("scissors") && computer.equals("paper"))) {
            return "You win.";
        }
        return "Computer wins.";
    }
}

