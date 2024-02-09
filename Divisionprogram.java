package java_course;


import java.util.Scanner;

public class Divisionprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            
            double result = divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            
            System.out.println("Program has ended.");
            scanner.close(); 
        }
    }


    public static double divideNumbers(int num1, int num2) {
        return (double) num1 / num2;
    }
}