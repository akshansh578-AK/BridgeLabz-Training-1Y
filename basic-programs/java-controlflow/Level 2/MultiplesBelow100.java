import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        System.out.println("A program to find all the multiples of a number below 100.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter a positive integer less than 100:");
                int number = sc.nextInt();

                if (number > 0 && number < 100) {
                    System.out.println("Multiples of " + number + " below 100 are:");
                    for (int i = 1; i < 100; i++) {
                        if (i % number == 0) {
                            System.out.println(i);
                        }
                    }
                } else {
                    System.out.println("Please enter a positive integer less than 100.");
                }
            }
        } finally {
            sc.close();
        }
    }
}
