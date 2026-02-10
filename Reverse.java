import java.util.Scanner;
class Reverse{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();

while(n!=0){
int d=n%10;

n=n/10;
System.out.print(d);
}
}}