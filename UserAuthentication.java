package java_course;
import java.util.Scanner;


public class UserAuthentication {
    public static void main(String[] args) {
       
    	String correctuname = "jan007";
        String correctpass = "sunny7358";

        
        Scanner sc = new Scanner(System.in);

        
        String uname;
        String pass;

        
        do {
            
        	System.out.print("Enter your username: ");
            uname = sc.nextLine();
            System.out.print("Enter your password: ");
            pass= sc.nextLine();

            
            if (uname.equals(correctuname) && pass.equals(correctpass)) {
                System.out.println("Login successful!");
                break; 
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        } while (true);

        sc.close();

    }
}


