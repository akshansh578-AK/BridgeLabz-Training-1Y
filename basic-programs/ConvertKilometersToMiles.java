/*
 * ConvertKilometersToMiles.java
 * 
 * Description: This program converts distance from kilometers to miles.
 * It takes the distance in kilometers as input from the user and
 * converts it into miles using the formula:
 * Miles = Kilometers * 0.621371
 */

import java.util.Scanner;

public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        double miles = kilometers * 0.621371;
        
        System.out.println("Distance in miles: " + miles);
        
        scanner.close();
    }
}
