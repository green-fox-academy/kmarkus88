import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
        System.out.println("Give meg a number pleeease!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try {
            int result = 10 / number;
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide with zero!");
        }

    }
}
