import java.util.Scanner;

// Prints odd numbers up to a given limit using continue.
public class OddNumbersWithContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        sc.close();
    }
}
