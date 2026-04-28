import java.util.Arrays;

// Removes duplicates from a sorted array and shows the new length.
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);

        System.out.println("New length: " + k);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
