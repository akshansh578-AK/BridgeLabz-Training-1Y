/*
 * AreaOfACircle.java
 * 
 * Description: This program calculates the area of a circle.
 * It takes the radius as input from the user and uses the formula:
 * Area = π * radius²
 */

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * radius * radius;
        
        System.out.println("Area of the circle: " + area);
        
        scanner.close();
    }
}
