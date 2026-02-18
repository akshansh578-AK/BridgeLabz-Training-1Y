import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println("A program to find the power of a number.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter the base number:");
                int number = sc.nextInt();
                System.out.println("Enter the power:");
                int power = sc.nextInt();
                long result = 1;

                if (number >= 0 && power >= 0) {
                    for (int i = 1; i <= power; i++) {
                        result *= number;
                    }
                    System.out.println(number + " to the power of " + power + " is " + result);
                } else {
                    System.out.println("Please enter positive integers for number and power.");
                }
            }
        } finally {
            sc.close();
        }
    }
}
