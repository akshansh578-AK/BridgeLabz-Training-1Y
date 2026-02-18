package com.gla.string;

import java.util.Scanner;

public class VotingEligibilityStringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        String ageInput = scanner.nextLine();

        String result = checkEligibility(name, ageInput);
        System.out.println(result);
        scanner.close();
    }

    private static String checkEligibility(String name, String ageInput) {
        if (name == null || name.trim().isEmpty()) {
            return "Name cannot be empty.";
        }
        try {
            int age = Integer.parseInt(ageInput.trim());
            if (age >= 18) {
                return name.trim() + " is eligible to vote.";
            }
            return name.trim() + " is not eligible to vote.";
        } catch (NumberFormatException e) {
            return "Invalid age input.";
        }
    }
}

