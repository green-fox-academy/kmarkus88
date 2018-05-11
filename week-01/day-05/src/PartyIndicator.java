import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number of boys!");
        int numberOfBoys = scanner.nextInt();

        System.out.println("Give me the number of girls!");
        int numberOfGirls = scanner.nextInt();

        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20

        if (numberOfBoys == numberOfGirls && numberOfBoys + numberOfGirls > 20) {
            System.out.println("The party is excellent.");
        }
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1

        else if (numberOfBoys + numberOfGirls > 20 && numberOfBoys > numberOfGirls && numberOfGirls != 0 || numberOfBoys < numberOfGirls) {
            System.out.println("Quite cool party.");
        }
        // It should print: Average party...
        // If there are less people coming than 20

        else if (numberOfBoys + numberOfGirls < 20) {
            System.out.println("Avarge party...");
        }

        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        else if (numberOfGirls == 0) {
            System.out.println("Sausage Party looool!!!!!");
        }
    }
}
