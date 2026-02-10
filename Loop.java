class Loop{
public static void main(String[]args)
{
int i=0;
while(i<=20)
{
System.out.println(i);
i++;
}
int j=0;
do {
    System.out.println(j);
    j++;
} while (j <= 20);
for(int k=0;k<=10;k++)
{
	for(int l=k;l<=5;l++){
	System.out.print("*");	
	}
System.out.println();
	}
	int[] arr={10,20,30,40};
	for(int num : arr){
		System.out.println(num);
	}
}
}