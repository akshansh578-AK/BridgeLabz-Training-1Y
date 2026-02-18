import java.util.Scanner;

public class CountDownTo1FOR {
    public static void main(String[] args) {
        System.out.println("Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch "); 
        Scanner sc = new Scanner(System.in);

        try {
            while(true) {
                System.out.println("Enter a starting countdown number :");
                int countdown = sc.nextInt();
                for(int i = countdown; i >= 1; i--) {
                    System.out.println(i);
                }
                System.out.println("Launched");
                    
            }
        }

        finally {
            sc.close();
        }
    }

    
}
