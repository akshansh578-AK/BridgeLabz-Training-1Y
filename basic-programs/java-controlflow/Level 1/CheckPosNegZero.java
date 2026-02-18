import java.util.Scanner;
public class CheckPosNegZero {
    public static void main(String[] args) {
        System.out.println("<===== Write a program to check whether a number is positive, negative, or zero. =====>");
        Scanner sc = new Scanner(System.in);
        try {
            while(true) {
                System.out.println("Enter a number to check (Pos/Neg/Zero): ");
                int num = sc.nextInt();
                if (num > 1) {
                    System.out.println("Positive");

                }
                else if(num == 0) {
                    System.out.println("Zero");

                }
                else {
                    System.out.println("Negative");
                }

            }

            
        }

        finally {
                sc.close();
            }
    }
    
}
