import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell me the number of chickens, please!");
        int chicks = scanner.nextInt();
        System.out.println("Tell me the number of pigs, pretty please!");
        int pigs = scanner.nextInt();
        System.out.println("The animals have " + ((chicks * 2) + (pigs * 4)) + " legs together.");



    }

}