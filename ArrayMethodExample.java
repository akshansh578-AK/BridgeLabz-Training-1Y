import java.util.Arrays;  
import java.util.Scanner; 

class ArrayMethodExample {
    public static void main(String[] args) {

        // Original array
        int[] arr = {10, 20, 30, 40};

        // Printing message
        System.out.println("Original array:");

        // Printing array reference (NOT elements)
        // This will NOT show elements properly
        System.out.println(arr);

        // Sorting the array
        Arrays.sort(arr);

        // Printing sorted array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr)); // Correct way to print array

        // Binary search (array must be sorted)
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30: " + index);

        // Second array for comparison
        int[] arr2 = {10, 20, 30, 40};

        // Comparing two arrays
        boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println("Both arrays are equal: " + isEqual);

        // Creating a new array of size 5
        int[] arr3 = new int[5];

        // Filling the array with value 7
        Arrays.fill(arr3, 7);

        // Printing filled array
        System.out.println("Filled array:");
        System.out.println(Arrays.toString(arr3));
    }
}
