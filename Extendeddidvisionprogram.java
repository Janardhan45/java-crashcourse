package java_course;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Extendeddidvisionprogram {
    public static void main(String[] args) {
        try {
            // Read numbers from the file "input.txt"
            File inputFile = new File("input.txt");
            Scanner fileScanner = new Scanner(inputFile);

            // Read the first number
            double num1 = fileScanner.nextDouble();

            // Read the second number
            double num2 = fileScanner.nextDouble();

            // Close the file scanner
            fileScanner.close();

            // Divide the first number by the second number
            double result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("Error: input.txt file not found.");
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Error: An unexpected error occurred.");
        } finally {
            // Print a message indicating the end of the program
            System.out.println("Program has ended.");
        }
    }
}
