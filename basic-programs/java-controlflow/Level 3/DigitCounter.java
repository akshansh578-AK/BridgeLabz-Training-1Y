import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {

        System.out.println("A program to count the number of digits in an integer.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            int originalNumber = number;
            int digitCount = 0;

            if (number == 0) {
                digitCount = 1;
            } else {
                if (number < 0) {
                    number = -number;
                }
                while (number > 0) {
                    number = number / 10;
                    digitCount++;
                }
            }

            System.out.println("The number of digits in " + originalNumber + " is: " + digitCount);

        } finally {
            sc.close();
        }
    }
}
