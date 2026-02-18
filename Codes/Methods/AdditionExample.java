// Demonstrates static and non-static members.
public class AdditionExample {
    static int staticNumber = 100;
    int nonStaticNumber = 200;

    static int addStatic(int a, int b) {
        return a + b;
    }

    int addNonStatic(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Static Variable: " + staticNumber);

        int result1 = addStatic(10, 20);
        System.out.println("Static Method Result: " + result1);

        AdditionExample obj = new AdditionExample();
        System.out.println("Non-Static Variable: " + obj.nonStaticNumber);

        int result2 = obj.addNonStatic(30, 40);
        System.out.println("Non-Static Method Result: " + result2);
    }
}
