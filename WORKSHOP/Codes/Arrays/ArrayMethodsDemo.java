import java.util.Arrays;

// Demonstrates common Arrays utility methods.
public class ArrayMethodsDemo {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);

        int[] expected = {10, 20, 30, 40};
        boolean isEqual = Arrays.equals(numbers, expected);
        System.out.println("Both arrays are equal: " + isEqual);

        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled Array:");
        System.out.println(Arrays.toString(filled));
    }
}
