import java.util.Scanner;
class Grade{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Mark");
int m=sc.nextInt();
if(m>=90){
System.out.println("A grade");
}
else if(m>=70)
{
System.out.println("B grade");
}
else if(m>=60){
System.out.println("C grade");
}
else {
System.out.println("Fail");
}
}
}
