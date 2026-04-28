// Reverses a character array using two pointers.
public class ReverseString {
    public static void main(String[] args) {
        char[] letters = {'J', 'a', 'v', 'a'};
        reverse(letters);

        System.out.print("Reversed: ");
        for (char ch : letters) {
            System.out.print(ch);
        }
        System.out.println();
    }

    static void reverse(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
