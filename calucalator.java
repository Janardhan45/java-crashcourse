package java_course;


import java.util.Scanner;

public class calucalator {

	public static void main(String args[])
	{
		Float a,b;
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		a= sc.nextFloat();
		b= sc.nextFloat();
		System.out.println("Enter the operation");
		s1 = sc.next();
		switch(s1) {
		case "add":
		{
			System.out.println(a+b);
			break;
		}
		case "sub":
		{
			System.out.println(a-b);
			break;
		}
		case "multiply":
		{
			System.out.println(a*b);
			break;
		}
		case "divide":
		{
			System.out.println(a/b);
			break;
		}
		default :
		{
			System.out.println("Invalid operation");
		}
		}
		
	}
	
}
