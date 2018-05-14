import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Height of the Pyramid?");
        int triangleRows = scanner.nextInt();

        for (int row = 0; row < triangleRows + 1; row++) {
            for (int spaces = triangleRows; spaces > row; spaces--) {
                System.out.print(" ");
            }

            for (int col = 0; col < ((row * 2) - 1); col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
