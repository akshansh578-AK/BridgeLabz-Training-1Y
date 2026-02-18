import java.util.Scanner;

public class LargestAmongst3Numbers {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<===== Program to check the largest amongst the 3 numbers =====>");

        try {
            while(true) {
                System.out.println("Enter first number :"); 
                int num1 = sc.nextInt();
                System.out.println("Enter second number :"); 
                int num2 = sc.nextInt();
                System.out.println("Enter third number :");
                int num3 = sc.nextInt();

                if (num1 > num2 && num1 > num2) {
                    System.out.println("First number is largest");
                }
                else if (num2 > num1 && num2 > num3) {
                    System.out.println("Second number is largest");
                }

                else {
                    System.out.println("Third number is largest");
                }
                






            }
        }

        finally {
            sc.close();
        }

    }

}
