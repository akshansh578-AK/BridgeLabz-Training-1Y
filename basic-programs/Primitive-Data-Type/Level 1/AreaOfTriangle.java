// Find area of a triangle in square inches and square centimeters
// Area of a Triangle is 1/2 * base * height

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        
        double areaSquareInches = (0.5 * base * height);
        double areaSquareCm = areaSquareInches * (2.54 * 2.54);
        
        System.out.println("Area of triangle is " + areaSquareInches + " square inches and " + areaSquareCm + " square centimeters");
        
        input.close();
    }
}
