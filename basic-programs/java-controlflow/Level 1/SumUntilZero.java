import java.util.Scanner;
public class SumUntilZero {
    public static void main (String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("A Program to find the sum of numbers until the user enters 0 ");
        
        double total = 0.0d;
        double num;
        
        try {
            System.out.println("Enter a number 1");
            num = sc.nextDouble();

            int i = 1;
            while (num != 0) {
                total = total + num;
                i++;
                
                System.out.println("Enter a number " + i);
                num = sc.nextDouble();
            }

            System.out.println("Total sum: " + total);

        

            

        }
        finally{
            sc.close();
        }

    }
    
}
