import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {

        System.out.println("A program to check if a number is prime.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

        } finally {
            sc.close();
        }
    }
}
