import java.util.Scanner;

public class AvargeOfInput {
    public static void main(String[] args) {

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the first number!");
        double first = scanner.nextInt();
        System.out.println("Give me the second number!");
        double second = scanner.nextInt();
        System.out.println("Give me the third number!");
        double third = scanner.nextInt();
        System.out.println("Give me the fourth number!");
        double fourth = scanner.nextInt();
        System.out.println("Give me the fifth number!");
        double fifth = scanner.nextInt();

        System.out.println("Sum: " + (first + second + third + fourth + fifth));
        System.out.println("Average: " + ((first + second + third + fourth + fifth) / 5));
    }
}
