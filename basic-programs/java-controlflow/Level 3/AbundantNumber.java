import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        System.out.println("A program to check if a number is an Abundant number.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            int sumOfDivisors = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }

            System.out.println("The sum of the proper divisors is: " + sumOfDivisors);
            if (sumOfDivisors > number) {
                System.out.println(number + " is an Abundant number.");
            } else {
                System.out.println(number + " is not an Abundant number.");
            }

        } finally {
            sc.close();
        }
    }
}
