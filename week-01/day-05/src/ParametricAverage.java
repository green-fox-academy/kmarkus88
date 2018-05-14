import java.util.Scanner;

public class ParametricAverage {

    public static void main
            (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputs;
        int sum = 0;
        int avg = 0;

        System.out.println("Number of integers?");
        inputs = scanner.nextInt();

        System.out.println("Enter your " + inputs + " integers:");
        for (int i = 0; i < inputs; i++) {
            System.out.print("number " + (i+1) + ": ");
            sum = sum + scanner.nextInt();
        }

        System.out.println("Sum: " + sum + ", Average: " + ((double) sum / inputs) );

    }

}