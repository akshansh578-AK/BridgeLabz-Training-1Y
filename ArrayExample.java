import java.util.Scanner;
class ArrayExample{
public static void main(String[] args){
int marks[] = {10,11,14,17,19};
System.out.println("Array elements:");
for (int i = 0;i<marks.length; i++){
        System.out.println(marks[i]);}
    System.out.println(marks[2]);
	System.out.println("updating elements");
	marks[3]=100;
	System.out.println("Array elements");
	for(int i=0;i<marks.length;i++){
	System.out.println(marks[i]);
	}
    for (int num:marks){
       System.out.println(num);}
    }
    }