import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("A program to play FizzBuzz.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter a positive integer:");
                int number = sc.nextInt();

                if (number > 0) {
                    for (int i = 1; i <= number; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.println("FizzBuzz");
                        } else if (i % 3 == 0) {
                            System.out.println("Fizz");
                        } else if (i % 5 == 0) {
                            System.out.println("Buzz");
                        } else {
                            System.out.println(i);
                        }
                    }
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            }
        } finally {
            sc.close();
        }
    }
}
