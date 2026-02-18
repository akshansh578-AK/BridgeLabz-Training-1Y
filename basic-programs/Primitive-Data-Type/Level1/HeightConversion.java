// Convert height in centimeters to feet and inches
// 1 foot = 12 inches and 1 inch = 2.54 cm

import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        
        double inches = heightCm / 2.54;
        double feet = inches / 12;
        double remainingInches = inches % 12;
        
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches);
        
        input.close();
    }
}
