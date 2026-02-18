import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<===== A Program to check for natural numbers and write the sum of n natural numbers =====>");

        try {
            while (true) {
                System.out.println("How many natural numbers sum you want?");
                int i = sc.nextInt();

                if (i <= 0) {
                    System.out.println(i + " is not a Natural number ");
                    break;
                }

                int sum = 0;
                for (int n = 1; n <= i; n++) {
                    sum += n;
                }
                System.out.println("The sum of first " + i + " numbers is " + sum);
            }
        } 
        finally {
            sc.close();
        }
    }
}