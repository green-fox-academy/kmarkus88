import java.util.Scanner;

public class Pyramid {
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

