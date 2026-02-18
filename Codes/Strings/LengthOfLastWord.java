// Finds the length of the last word in a sentence.
public class LengthOfLastWord {
    public static void main(String[] args) {
        String text = "Java is easy";
        int length = lengthOfLastWord(text);
        System.out.println("Length of last word: " + length);
    }

    static int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
