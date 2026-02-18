import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        System.out.println("A program to find the factors of a number using a while loop.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter a positive integer:");
                int number = sc.nextInt();

                if (number > 0) {
                    System.out.print("Factors of " + number + " are: ");
                    int i = 1;
                    while (i <= number) {
                        if (number % i == 0) {
                            System.out.print(i + " ");
                        }
                        i++;
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
