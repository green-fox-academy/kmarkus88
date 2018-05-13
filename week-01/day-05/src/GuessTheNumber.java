import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a maximum random number! (my minimum will be 0)");
        int max = scanner.nextInt();
        int secretNumber = (int) (Math.random() * (max+1));

        System.out.println("Try to guess the number!");
        System.out.println("What's the number?");
        int guess = scanner.nextInt();

        while (secretNumber != guess) {
            if (guess > secretNumber) {
                System.out.println("The stored number is lower, guess again!");
                guess = scanner.nextInt();
            } else if (guess < secretNumber) {
                System.out.println("The stored number is higher, guess again!");
                guess = scanner.nextInt();
            }
        }
        System.out.println("You found the number: " + secretNumber);
    }
}