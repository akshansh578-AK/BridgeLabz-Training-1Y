import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        System.out.println("A program to find the greatest factor of a number besides itself using a while loop.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter an integer:");
                int number = sc.nextInt();
                int greatestFactor = 1;

                if (number > 1) {
                    int counter = number - 1;
                    while (counter >= 1) {
                        if (number % counter == 0) {
                            greatestFactor = counter;
                            break;
                        }
                        counter--;
                    }
                    System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
                } else {
                    System.out.println("Please enter an integer greater than 1.");
                }
            }
        } finally {
            sc.close();
        }
    }
}
