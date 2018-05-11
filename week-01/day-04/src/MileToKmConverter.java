import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type how much KM do you want to convert!!!");

        int km = scanner.nextInt();
        // The program stops and waits for user input that is an integer and to press enter
        // 1 km = 0.62 miles
        System.out.println("This lenght is " +(double) km * 0.62 + " miles.");
        // System.out.println("Please enter an integer for km that I will convert to miles!");
        
    }
}
