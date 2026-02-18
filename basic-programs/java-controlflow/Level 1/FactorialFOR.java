import java.util.Scanner;
public class FactorialFOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A Program to find the factorial of an integer entered by the user");
        System.out.println("Enter a non-negative integer: ");

        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            sc.close();
            return;
        }

        long factorial = 1;
        for(int i = number; i >= 1; i--) {
            factorial = factorial * i;

        }

        System.out.println("Factorial of " + number + " is " + factorial);
        sc.close();
        
        
    }
    
}
