import java.util.Scanner;
public class FactorialWHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A Program to find the factorial of an integer entered by the user");
        System.out.print("Enter a non-negative integer: ");

        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            sc.close();
            return;
        }

        long factorial = 1;
        int i = number;
        while (i >= 1) {
            factorial = factorial *i;
            i--;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
        sc.close();
    }
    
}
