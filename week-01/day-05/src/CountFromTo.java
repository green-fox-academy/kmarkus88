import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number!");
        int numberOne = scanner.nextInt();

        System.out.println("Give me the second number!");
        int numberTwo = scanner.nextInt();

        if (numberTwo <= numberOne) {
            System.out.println("The second number should be bigger!");
        }
        else {
            for (int i = 0; i < (numberTwo-numberOne); i++) {
                System.out.println(numberOne+i);
            }
        }

    }
}
