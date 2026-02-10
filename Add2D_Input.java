import java.util.Scanner;
public class Add2D_Input{
	public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int[][] arr= new int[2][3];
System.out.println("Enter the elements");
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
arr[i][j]=sc.nextInt();
}
}
System.out.println("2D array elments are");
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
System.out.println(arr[i][j] +" ");
}
System.out.println();
}
}
}