// Finds the index of the first unique character in a string.
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String text = "loveleetcode";
        int index = firstUniqChar(text);
        System.out.println("First unique character index: " + index);
    }

    static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
