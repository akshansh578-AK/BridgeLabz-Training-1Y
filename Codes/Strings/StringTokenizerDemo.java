import java.util.StringTokenizer;

// Demonstrates tokenizing a string using StringTokenizer.
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String text = "Java is easy";
        StringTokenizer tokenizer = new StringTokenizer(text);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
