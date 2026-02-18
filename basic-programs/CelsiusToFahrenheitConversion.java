/*
 * CelsiusToFahrenheitConversion.java
 * 
 * Description: This program takes the temperature in Celsius as input
 * from the user and converts it to Fahrenheit using the formula:
 * Fahrenheit = (Celsius * 9/5) + 32
 */

import java.util.Scanner;

public class CelsiusToFahrenheitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}
