// Demonstrates enhanced for-each loop and continue.
public class EnhancedForLoopDemo {
    public static void main (String [] args) {
        int arr[] = {10,20,30,40};
        for (int num: arr) {
            if (num == 20) {
                System.out.println("Skipped");
                continue;
            }
            System.out.println(num);
        }
    }
}