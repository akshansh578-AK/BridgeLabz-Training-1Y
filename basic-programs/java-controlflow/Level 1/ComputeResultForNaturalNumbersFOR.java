import java.util.Scanner;
public class ComputeResultForNaturalNumbersFOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Natural Number ");
        int n = sc.nextInt();
        if (n >= 1) {
            System.out.println("Its a Natural Number ");
        }
        else {
            System.out.println(n + " -- Not a valid Natural Number");
        }
        int sum = 0;
        
        try {
            for(int i = 1; n >= i; i++) {
                sum = sum + i;

            }
            if ( sum >= 1) {
            System.out.println(sum);
            }
            int formulae = n*(n+1)/2;

            if (sum == formulae) {
                System.out.println("True");
            }
            else if (sum != formulae ) {
                System.out.println("False");
            }
            else {
                System.out.println("Validation and Computation failed as User inputs a not valid Natural Number");

            }

        }
        
        finally {
            sc.close();
        }
    }
    
}
