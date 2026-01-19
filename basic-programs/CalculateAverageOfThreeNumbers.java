/*
 * CalculateAverageOfThreeNumbers.java
 * 
 * Description: This program calculates the average of three numbers.
 * It takes three numbers as input from the user and prints their average.
 * Average = (number1 + number2 + number3) / 3
 */

import java.util.Scanner;

public class CalculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        double average = (num1 + num2 + num3) / 3;
        
        System.out.println("Average of the three numbers: " + average);
        
        scanner.close();
    }
}
