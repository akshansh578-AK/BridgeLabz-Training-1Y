import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("A program to check if a number is an Armstrong number.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            int originalNumber = number;
            int sumOfCubes = 0;
            int remainder;

            while (number > 0) {
                remainder = number % 10;
                sumOfCubes += (remainder * remainder * remainder);
                number = number / 10;
            }

            if (sumOfCubes == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }

        } finally {
            sc.close();
        }
    }
}
