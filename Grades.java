package java_course;

import java.util.Scanner;

public class Grades {

	public static void main(String args[]) {
		int n;
		System.out.println("Enter Input");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>=90) {
			System.out.println("Grade A");
		}
		else if(n>=80) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("Grade C");
		}
	}
}
