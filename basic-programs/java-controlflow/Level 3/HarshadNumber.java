import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        System.out.println("A program to check if a number is a Harshad number.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            int originalNumber = number;
            int sumOfDigits = 0;
            int remainder;

            while (number > 0) {
                remainder = number % 10;
                sumOfDigits += remainder;
                number = number / 10;
            }

            if (originalNumber % sumOfDigits == 0) {
                System.out.println(originalNumber + " is a Harshad number.");
            } else {
                System.out.println(originalNumber + " is not a Harshad number.");
            }

        } finally {
            sc.close();
        }
    }
}
