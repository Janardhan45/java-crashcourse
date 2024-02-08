
package java_course;
 
import java.util.Scanner;

public class multiply {
	public static void main(String args[]) {
	int a,i,z;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the value");
	
	a = sc.nextInt();
	
	for(i=1;i<=10;i++) {
		z=a*i;
		
		System.out.println(a + " * "+ i+ " = "+z);
	}
	}

}
