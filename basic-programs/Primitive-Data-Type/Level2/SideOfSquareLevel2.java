// Find the side of the square from perimeter
// Perimeter of Square is 4 times side

import java.util.Scanner;

public class SideOfSquareLevel2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();
        
        double side = perimeter / 4;
        
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        input.close();
    }
}
