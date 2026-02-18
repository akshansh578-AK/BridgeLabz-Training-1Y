import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {

        System.out.println("A program to calculate Body Mass Index (BMI).");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your weight in kilograms (kg): ");
            double weightKg = sc.nextDouble();

            System.out.print("Enter your height in centimeters (cm): ");
            double heightCm = sc.nextDouble();

            double heightM = heightCm / 100.0;

            double bmi = weightKg / (heightM * heightM);

            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) {
                category = "Normal weight";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obesity";
            }

            System.out.println("\n--- BMI Result ---");
            System.out.printf("Your BMI is: %.2f\n", bmi);
            System.out.println("Weight Category: " + category);

        } finally {
            sc.close();
        }
    }
}
