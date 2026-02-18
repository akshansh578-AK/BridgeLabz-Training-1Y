import java.util.Scanner;
public class OddAndEven {
    public static void main(String[] args) {
        System.out.println("A Program to print odd and even numbers between 1 to the number entered by the user. ");
        Scanner sc = new Scanner(System.in);

        try {
            while(true) {
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                if (num >= 1) {
                    for (int i = 1; i <= num; i++) {
                        if (i %2== 0) {
                            System.out.println(i + " is an Even Number");
                        }
                        else if (i %2 != 0) {
                            System.out.println(i+ " is an Odd Number");
                        }
                    }
                }
                
            }
        }
        finally{
            sc.close();
        }
       
        
      
    }
        

    
}
