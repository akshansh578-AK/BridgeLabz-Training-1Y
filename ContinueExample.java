public class ContinueExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            // Skip even numbers
            if (i % 2 == 0) {
                continue;  
            }

            System.out.println("Odd number: " + i);
        }
    }
}
