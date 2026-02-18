/*
 * VolumeOfACylinder.java
 * 
 * Description: This program calculates the volume of a cylinder.
 * It takes the radius and height as inputs from the user and uses the formula:
 * Volume = π * radius² * height
 */

import java.util.Scanner;

public class VolumeOfACylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        double volume = Math.PI * radius * radius * height;
        
        System.out.println("Volume of the cylinder: " + volume);
        
        scanner.close();
    }
}
