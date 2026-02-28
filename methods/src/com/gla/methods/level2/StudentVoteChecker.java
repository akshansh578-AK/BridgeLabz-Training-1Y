package com.gla.methods.level2;

import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean isStudent(boolean studentFlag) {
        return studentFlag;
    }

    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public static String getEligibilityMessage(boolean studentFlag, int age) {
        return "Student: " + isStudent(studentFlag) + ", Eligible to vote: " + isEligibleToVote(age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Are you a student? (true/false): ");
        boolean studentFlag = scanner.nextBoolean();

        System.out.println(getEligibilityMessage(studentFlag, age));
        scanner.close();
    }
}
