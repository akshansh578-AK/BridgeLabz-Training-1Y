import java.util.Scanner;
public class LeapYearMultipleIf {
    public static void main(String[] args) {

        System.out.println("A program to check if a year is a leap year using multiple if-else.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a year (must be 1582 or later): ");
            int year = sc.nextInt();

            if (year < 1582) {
                System.out.println("Please enter a year of 1582 or later.");
            } else {
                if ((year % 400) == 0) {
                    System.out.println(year + " is a leap year.");
                } else if ((year % 100) == 0) {
                    System.out.println(year + " is not a leap year.");
                } else if ((year % 4) == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        } finally {
            sc.close();
        }
    }
}
