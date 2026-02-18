import java.util.Scanner;

// Adds two numbers using a separate method.
public class BasicMethodDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        add(num1, num2);
        sc.close();
    }

    static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
