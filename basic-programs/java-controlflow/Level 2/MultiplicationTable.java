import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("A program to find the multiplication table of a number entered by the user from 6 to 9. ");
        Scanner sc = new Scanner(System.in);
        try {
            while(true) {
                    
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " +  i + " = " + num * i);
        }
            }

        }
        finally {
            sc.close();

        }
        



    




}





    
    
}
