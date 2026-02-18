import java.util.Scanner;

// Adds two numbers provided by the user.
public class TwoNumberAddition {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        int result = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);
        sc.close();
        

    }
    
    public static int add(int num1, int num2) {

        return num1 + num2;


    }
    
}
