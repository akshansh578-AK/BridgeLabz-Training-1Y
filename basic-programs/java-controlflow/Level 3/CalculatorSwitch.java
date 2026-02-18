import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {

        System.out.println("A simple calculator using switch case.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                    break;
            }

        } finally {
            sc.close();
        }
    }
}
