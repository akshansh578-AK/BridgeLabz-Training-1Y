/*
 * PowerCalculation.java
 * 
 * Description: This program calculates the power of a number.
 * It takes two numbers as input from the user: a base and an exponent,
 * and prints the result of base raised to the exponent.
 * Uses Math.pow() method for the calculation.
 */

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        double result = Math.pow(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
        
        scanner.close();
    }
}
