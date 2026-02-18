// Demonstrates common String methods.
public class StringMethods {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.charAt(5));
        System.out.println(text.substring(5));
        System.out.println(text.substring(0, 4));
        System.out.println(text.contains("Java"));
        System.out.println(text.equals("Java Programming"));
    }
}
