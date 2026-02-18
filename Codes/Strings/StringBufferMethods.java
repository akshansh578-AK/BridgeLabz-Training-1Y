// Demonstrates common StringBuffer methods.
public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");

        buffer.append(" World");
        System.out.println("append: " + buffer);

        buffer.insert(5, ",");
        System.out.println("insert: " + buffer);

        buffer.replace(6, 11, "Java");
        System.out.println("replace: " + buffer);

        buffer.delete(5, 6);
        System.out.println("delete: " + buffer);

        buffer.reverse();
        System.out.println("reverse: " + buffer);

        System.out.println("length: " + buffer.length());
        System.out.println("charAt(2): " + buffer.charAt(2));

        buffer.setCharAt(2, 'X');
        System.out.println("setCharAt: " + buffer);

        System.out.println("substring: " + buffer.substring(1, 4));
    }
}
