import java.util.Scanner;
public class SumOfTwoDArray{
	public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("enter row");
int r=sc.nextInt();
System.out.println("enter coloumn");
int c=sc.nextInt();

int[][] arr1= new int[r][c];
System.out.println("Enter the elements of mat 1");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr1[i][j]=sc.nextInt();
}
}
int[][] arr2= new int[r][c];
System.out.println("Enter the elements of mat 2");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr2[i][j]=sc.nextInt();
}
}int[][] arr3= new int[r][c];

System.out.println("sum is");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr3[i][j]=arr1[i][j]+arr2[i][j];
System.out.print(" "+arr3[i][j]);
}
System.out.println();
}
}
}
