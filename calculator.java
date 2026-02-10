import java.util.Scanner;
class Calculator{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b= sc.nextInt();
int c=a+b;
int d= a-b;
int e=a*b;
double f=a/b;
System.out.println("the sum is "+c);
System.out.println("the difference is "+d);
System.out.println("the product  is "+e);
System.out.println("the division is "+f);
}
}
 