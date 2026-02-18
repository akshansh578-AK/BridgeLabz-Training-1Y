/*
 * PerimeterOfARectangle.java
 * 
 * Description: This program calculates the perimeter of a rectangle.
 * It takes the length and width as inputs from the user and uses the formula:
 * Perimeter = 2 * (length + width)
 */

import java.util.Scanner;

public class PerimeterOfARectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        double perimeter = 2 * (length + width);
        
        System.out.println("Perimeter of the rectangle: " + perimeter);
        
        scanner.close();
    }
}
