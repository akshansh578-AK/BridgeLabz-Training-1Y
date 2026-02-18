import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        System.out.println("A program to calculate grade based on average percentage.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks for Physics: ");
            int physicsMarks = sc.nextInt();

            System.out.print("Enter marks for Chemistry: ");
            int chemistryMarks = sc.nextInt();

            System.out.print("Enter marks for Maths: ");
            int mathsMarks = sc.nextInt();

            double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
            double averagePercentage = (totalMarks / 300) * 100;

            char grade;
            String remarks;

            if (averagePercentage >= 80) {
                grade = 'A';
                remarks = "Excellent";
            } else if (averagePercentage >= 70) {
                grade = 'B';
                remarks = "Very Good";
            } else if (averagePercentage >= 60) {
                grade = 'C';
                remarks = "Good";
            } else if (averagePercentage >= 50) {
                grade = 'D';
                remarks = "Satisfactory";
            } else if (averagePercentage >= 40) {
                grade = 'E';
                remarks = "Needs Improvement";
            } else {
                grade = 'R';
                remarks = "Fail";
            }

            System.out.println("\n--- Results ---");
            System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);

        } finally {
            sc.close();
        }
    }
}
