import java.util.Scanner;

// Calculates the sum of elements in a 1D array.
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
}
