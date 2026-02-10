class StringMethodsDemo{
public static void main(String[]args){
String s="java programming";
//length()
System.out.println(s.length());
//toUpperCase()
System.out.println(s.toUpperCase());
//toLowerCase()
System.out.println(s.toLowerCase());
//charAt()
System.out.println(s.charAt(5));//p
//substring()
System.out.println(s.substring(5));//programming
System.out.println(s.substring(0, 4));//java
//contain();
System.out.println(s.contains("java"));//true
//equals()
System.out.println(s.equals("java programming"));//true
}
}