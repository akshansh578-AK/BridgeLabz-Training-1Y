import java.util.Scanner;

// Demonstrates switch-case with user input.
public class AgeEligibilitySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("HELLO WORLD !!");
                break;
            case 2:
                System.out.println("HELLO JAVA");
                break;
            default:
                System.out.println("Heeeeyyyyyyyy");
                break;
        }

        sc.close();
    }
}
