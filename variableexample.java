class variableexample{ 
int id = 10;      
String name= "Jay";   

int rollNo;  

static int age =20;

void display()   
{
   String status= "Active"; 
System.out.println("Status: "+status);  
}
public static void main(String args[])
{

variableexample var= new variableexample();
var.display();  
var.rollNo= 20; 

System.out.println(age); 
}
}

    

