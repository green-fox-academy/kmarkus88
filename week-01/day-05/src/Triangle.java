import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        int number = scanner.nextInt();

        for (int row = 0; row < number+1; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}

