package Workshop;
import java.util.Arrays;
    class RotationOfElements {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60, 70};
            int k = 3;
            int n = arr.length;
            k = k % n;

            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);

            System.out.println(Arrays.toString(arr));
        }

        static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }
    }
