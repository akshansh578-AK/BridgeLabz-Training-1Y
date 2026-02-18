import java.util.Scanner;

public class FriendComparator {
    public static void main(String[] args) {
        System.out.println("A program to find the youngest and tallest friend.");
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter Amar's age:");
                int amarAge = sc.nextInt();
                System.out.println("Enter Amar's height:");
                double amarHeight = sc.nextDouble();

                System.out.println("Enter Akbar's age:");
                int akbarAge = sc.nextInt();
                System.out.println("Enter Akbar's height:");
                double akbarHeight = sc.nextDouble();

                System.out.println("Enter Anthony's age:");
                int anthonyAge = sc.nextInt();
                System.out.println("Enter Anthony's height:");
                double anthonyHeight = sc.nextDouble();

                // Find the youngest
                if (amarAge < akbarAge && amarAge < anthonyAge) {
                    System.out.println("Amar is the youngest.");
                } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
                    System.out.println("Akbar is the youngest.");
                } else {
                    System.out.println("Anthony is the youngest.");
                }

                // Find the tallest
                if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
                    System.out.println("Amar is the tallest.");
                } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
                    System.out.println("Akbar is the tallest.");
                } else {
                    System.out.println("Anthony is the tallest.");
                }
            }
        } finally {
            sc.close();
        }
    }
}
