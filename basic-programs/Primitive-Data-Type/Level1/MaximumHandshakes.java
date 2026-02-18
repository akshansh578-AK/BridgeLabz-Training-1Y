// Find the maximum number of handshakes among N students
// Formula: (n * (n - 1)) / 2

import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        
        long handshakes = (long) (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("Maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
        
        input.close();
    }
}
