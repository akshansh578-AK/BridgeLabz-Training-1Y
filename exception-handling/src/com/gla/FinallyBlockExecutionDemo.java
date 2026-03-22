package com.gla;

import java.util.Scanner;

public class FinallyBlockExecutionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}
