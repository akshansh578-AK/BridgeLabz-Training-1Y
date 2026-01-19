// Convert distance in kilometers to miles with user input

import java.util.Scanner;

public class ConvertKmToMilesWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in km: ");
        double km = input.nextDouble();
        
        double miles = km / 1.6;
        
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        input.close();
    }
}
