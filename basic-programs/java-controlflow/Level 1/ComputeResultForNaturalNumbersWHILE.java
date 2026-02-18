import java.util.Scanner;
public class ComputeResultForNaturalNumbersWHILE {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt(); 
        if (n == 0) {
            System.out.println(n + " -- Not a valid Natural Number");
        }
        int sum = 0;
        

        try {
            
            int i = 1;
            while (i <= n) {
                sum = sum + i;
                i++;
                
            }
            if (sum >= 1) {
                System.out.println(sum);
                

            }
            
            

            int formulae = n*(n+1)/2;

            if (sum == formulae && sum >= 1 && formulae >= 1 ) {
                System.out.println("True, Sum == Formulae");
            }

            else if (sum != formulae){
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
