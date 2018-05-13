import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int a = scanner.nextInt();
        System.out.println("and give me an another!");
        int b = scanner.nextInt();
        int bigger = (a - b > 0) ? a : b;
        System.out.println("The bigger number is: " + bigger);

    }

}