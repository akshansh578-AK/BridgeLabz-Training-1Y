import java.util.Scanner;

// Demonstrates basic array operations and searching.
public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {12, 14, 16, 18, 20};
        System.out.println("Using for-each loop:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("Element at index 1: " + marks[1]);

        System.out.println("Update Array Elements:");
        marks[3] = 100;

        System.out.println("Array elements:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.print("Enter your element: ");
        int target = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == target) {
                System.out.println("Number found at index: " + i);
            }
        }

        sc.close();
    }
}
