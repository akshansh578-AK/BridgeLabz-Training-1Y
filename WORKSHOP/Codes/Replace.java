package Workshop;

public class Replace {
    public static void main(String[] args) {
        int num = 100203;
        int result = Integer.parseInt(String.valueOf(num).replace('0', '1'));

        System.out.println("Original: " + num);
        System.out.println("Modified: " + result);
    }
}

