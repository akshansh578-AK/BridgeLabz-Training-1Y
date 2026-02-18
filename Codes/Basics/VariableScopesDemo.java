// Demonstrates instance, static, and local variables.
public class VariableScopesDemo {
    int id = 10;
    String name = "Jay";
    int rollNo;

    static int age = 20;

    void display() {
        String status = "Active";
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        VariableScopesDemo var = new VariableScopesDemo();
        var.display();
        var.rollNo = 20;
        System.out.println(age);
    }
}
