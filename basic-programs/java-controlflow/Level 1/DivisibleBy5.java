import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("<====== A Program to check if a number is divisible by 5 ======>");
        System.out.println("Enter 0 to exit.");

        try {
            while (true) {
                System.out.println("Enter a number :");
                int num = sc.nextInt();

                if (num == 0) {
                    break;
                }

                if (num % 5 == 0) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
        } finally {
            sc.close();
        }
     
        
    }

       

}
