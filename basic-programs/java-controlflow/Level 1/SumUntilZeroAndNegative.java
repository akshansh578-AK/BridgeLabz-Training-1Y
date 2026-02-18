import java.util.Scanner;
public class SumUntilZeroAndNegative {
    public static void main(String[] args) {
        System.out.println("A Program to find the sum until the user enters 0 or a negative number using while loop and break statement");

        Scanner sc = new Scanner(System.in);
        double total = 0.0d;
        double num;

        try {
            System.out.println("Enter a number 1");
            num = sc.nextDouble();
            

            int i = 1;
            while(num != 0 && num > 0) {
                
                total = total + num;
                i++;

                System.out.println("Enter a number : " + i); 

                num = sc.nextDouble();


            }

            System.out.println(total);
        }

        finally {
            sc.close();
        }

        
    }
    
}
