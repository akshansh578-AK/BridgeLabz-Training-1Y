import java.util.*;

// Reads array elements from the user and prints them.
public class ArrayInputOutput {
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
    }

    finally {
        sc.close();
    }
    }
}
