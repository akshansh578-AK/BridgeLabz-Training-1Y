import java.util.Arrays;

// Moves all zeros to the end of the array while keeping order of others.
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }

    static void moveZeroes(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        while (k < arr.length) {
            arr[k] = 0;
            k++;
        }
    }
}
