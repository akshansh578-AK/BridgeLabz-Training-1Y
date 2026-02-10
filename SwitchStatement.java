import java.util.Scanner;
class SwitchStatement{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the day no");
int n= sc.nextInt();
switch(n){
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("wednesday");
break;
case 4:
System.out.println("thrusday");
break;
case 5:
System.out.println("friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("invalid input");
}
}
}