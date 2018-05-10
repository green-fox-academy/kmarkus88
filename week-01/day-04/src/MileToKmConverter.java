import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type how much KM!!!");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput2 = scanner.nextInt();

        userInput2 = userInput2 / (int)0.621371192;

        // It prints the integer
        System.out.println(userInput2);
    }
}
