// Prints basic star patterns using loops.
public class StarPatterns {
    public static void main(String[] args) {
        int rows = 5;
        
        System.out.println("Right-angled Triangle Pattern:");
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         System.out.println("\nBlock Pattern:");
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\nPyramid Pattern:");
        
        for(int i = 1; i <= rows; i++) {
            
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
