import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        System.out.println("A program to play FizzBuzz using a while loop.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter a positive integer:");
                int number = sc.nextInt();

                if (number > 0) {
                    int i = 1;
                    while (i <= number) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.println("FizzBuzz");
                        } else if (i % 3 == 0) {
                            System.out.println("Fizz");
                        } else if (i % 5 == 0) {
                            System.out.println("Buzz");
                        } else {
                            System.out.println(i);
                        }
                        i++;
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
