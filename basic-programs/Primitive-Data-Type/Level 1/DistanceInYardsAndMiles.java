// Find the distance in yards and miles from feets
// 1 mile = 1760 yards and 1 yard = 3 feet

import java.util.Scanner;

public class DistanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        
        System.out.println("Distance in yards is " + yards + " and in miles is " + miles + " for the given " + distanceInFeet + " feets");
        
        input.close();
    }
}
