import java.util.*;

// Performs binary search on a user-provided array.
public class ArrayBinarySearch {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {System.out.println("Enter number of elements you want in array:");
        int n = sc.nextInt();    

        int arr[] = new int[n];
        System.out.println("Enter " + n + " integer numbers:");
        
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();    
        } 
      
        System.out.println("Elements of array are: ");
        for(int i=0 ; i<n ; i++){
           System.out.println(arr[i]);
           
        }
        System.out.println("Enter your num: ");
        int num=sc.nextInt();

        int index = Arrays.binarySearch(arr, num);
        if (index >= 0) {
            for(int i = 0; i >= 0; i++)
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    finally {
        sc.close();
    }
    }

    
    
}
