// Demonstrates creating objects using a parameterized constructor.
public class ConstructorExample {
    int id;
    String name;
    int age;

    ConstructorExample(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorExample student = new ConstructorExample(1, "Jay", 25);
        student.display();
    }
}
