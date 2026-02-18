import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("A program to find the factors of a number.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter a positive integer:");
                int number = sc.nextInt();

                if (number > 0) {
                    System.out.print("Factors of " + number + " are: ");
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            }
        } finally {
            sc.close();
        }
    }
}
