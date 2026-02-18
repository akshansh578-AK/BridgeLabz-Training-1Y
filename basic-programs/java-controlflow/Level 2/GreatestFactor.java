import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        System.out.println("A program to find the greatest factor of a number besides itself.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter an integer:");
                int number = sc.nextInt();
                int greatestFactor = 1;

                if (number > 1) {
                    for (int i = number - 1; i >= 1; i--) {
                        if (number % i == 0) {
                            greatestFactor = i;
                            break;
                        }
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
