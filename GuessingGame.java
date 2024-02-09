package java_course;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1; 
        int guess;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100.");
        
        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                break; 
            	}
        }
        
        scanner.close();
    }
}