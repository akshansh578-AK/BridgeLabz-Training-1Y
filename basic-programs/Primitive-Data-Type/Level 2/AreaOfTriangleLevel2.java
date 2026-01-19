// Find the area of a triangle in square inches and square centimeters
// Area of a Triangle is 1/2 * base * height, 1 in = 2.54 cm

import java.util.Scanner;

public class AreaOfTriangleLevel2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        
        double areaSquareCm = 0.5 * baseCm * heightCm;
        double areaSquareInches = areaSquareCm / (2.54 * 2.54);
        
        System.out.println("The Area of the triangle in sq in is " + areaSquareInches + " and sq cm is " + areaSquareCm);
        
        input.close();
    }
}
