import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        System.out.println("Give me a max number! The numbers are always positive.");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        Random rand = new Random();
        int  n = rand.nextInt(max) + 0;

        System.out.println("Lets try it out!");

        int guess = scanner.nextInt();

        while (n != guess) {
            if (guess > n) {
                System.out.println("The stored number is lower");
                guess = scanner.nextInt();
            } else if (guess < n) {
                System.out.println("The stored number is higher");
                guess = scanner.nextInt();
            }

        }
        System.out.println("You found the number: " + n);
    }

}

