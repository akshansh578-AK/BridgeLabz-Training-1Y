import java.util.*;

public class BinaryNumbersQueue {

    public static List<String> generate(int n) {
        Queue<String> q = new LinkedList<>();
        List<String> result = new ArrayList<>();

        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            result.add(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Binary Numbers: " + generate(n));
    }
}
}