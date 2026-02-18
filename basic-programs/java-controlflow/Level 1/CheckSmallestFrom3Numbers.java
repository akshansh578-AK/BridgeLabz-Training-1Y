import java.util.Scanner;
public class CheckSmallestFrom3Numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<===== A program to check if the first number entered is the smallest from the next 2 numbers entered =====>.");

        try {
            while(true) {
                System.out.println("Enter first number :");
                int num1 = sc.nextInt();
                System.out.println("Enter second number :");
                int num2 = sc.nextInt();
                System.out.println("Enter third number :");
                int num3 = sc.nextInt();

                if(num1 < num2 && num1 < num3) {
                    System.out.println("Yes " + num1 + "is the Smallest amongst all user inputs");

                  

                }

                else {
                    System.out.println("Condition doesn't meant");
                }


                  
            }

            
        }

        finally
            {
                sc.close();
            }

        

    


    }

}
