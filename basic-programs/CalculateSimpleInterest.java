/*
 * CalculateSimpleInterest.java
 * 
 * Description: This program calculates simple interest.
 * It takes Principal, Rate (per annum), and Time (in years) as inputs
 * from the user and uses the formula:
 * Simple Interest = (Principal * Rate * Time) / 100
 */

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the Rate of interest (per annum): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter the Time period (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest: " + simpleInterest);
        
        scanner.close();
    }
}
