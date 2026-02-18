import java.util.Scanner;
public class EmployeeBonses {
    public static void main(String[] args) {
        System.out.println("A Program to find the bonuses of employees based on their years of service. ");
        Scanner sc = new Scanner(System.in);

        try {
            while(true) {
                System.out.println("Enter YoS"); 
                int YoS = sc.nextInt();
                if (YoS >= 5) {
                    System.out.println("Enter your salary");
                    double salary = sc.nextInt();
                    System.out.println("Your current salary " + salary);
                    double bonus = salary * 0.05;
                    System.out.println("Your bonus " + bonus);
                    double total = bonus + salary;

                    System.out.println("Your Salary after 5% bonus " + total);

                
                }
                
                else {
                    System.out.println("Sorry you are not eligible for bonus");
                }
            }
        }
        finally{
            sc.close();
        }
    }
    
}
