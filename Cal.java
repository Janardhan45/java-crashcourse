package java_course;

import java.util.Scanner;
public class Cal {
public static void main(String args[])
{
	
float a,b;
String s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers");
a=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Enter operation");
s=sc.next();
if (s.equals("add"))
{
	System.out.println(a+b);
}
else if(s.equals("sub"))
{
System.out.println(a-b);

}
else if(s.equals("multpile"))
{
	System.out.println(a*b);
	
}
else if(s.equals("divide"))
{
System.out.println(a/b);	
}

else
{
System.out.println("Invalid operation");	
}
}

}
