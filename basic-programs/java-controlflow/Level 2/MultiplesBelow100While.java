import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        System.out.println("A program to find all the multiples of a number below 100 using a while loop.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter a positive integer less than 100:");
                int number = sc.nextInt();

                if (number > 0 && number < 100) {
                    System.out.println("Multiples of " + number + " below 100 are:");
                    int i = 1;
                    while (i < 100) {
                        if (i % number == 0) {
                            System.out.println(i);
                        }
                        i++;
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
