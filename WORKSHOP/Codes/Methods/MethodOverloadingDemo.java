// Demonstrates method overloading with different parameter lists.
public class MethodOverloadingDemo {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        System.out.println("Addition of 2 Numbers: " + obj.add(10, 20));
        System.out.println("Addition of 3 integers: " + obj.add(10, 20, 30));
        System.out.println("Addition of 2 double values: " + obj.add(10.5, 20.5));
    }
}
