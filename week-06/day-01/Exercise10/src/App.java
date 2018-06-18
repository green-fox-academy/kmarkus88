import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
  public static void main(String[] args) {

    Fox fox1 = new Fox("Feri", "pallida", "green");
    Fox fox2 = new Fox("Juli", "junior", "green");
    Fox fox3 = new Fox("Erzsi", "pallida", "red");
    Fox fox4 = new Fox("Peti", "senior", "black");
    Fox fox5= new Fox("Abraham", "pallida", "green");

    ArrayList<Fox> foxes = new ArrayList<>();
    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);

    System.out.println(getGreenFoxes(foxes));
    System.out.println(getGreenAndPallidaFoxes(foxes));
  }
  private static String getGreenFoxes(ArrayList<Fox> foxes) {
    return foxes.stream()
            .filter(fox -> fox.getColor().equalsIgnoreCase("green"))
            .map(fox -> fox.getName().toString())
            .collect(Collectors.joining(", "));

  }

  private static String getGreenAndPallidaFoxes(ArrayList<Fox> foxes) {
    return foxes.stream()
            .filter(fox -> fox.getType().equalsIgnoreCase("pallida"))
            .filter(fox -> fox.getColor().equalsIgnoreCase("green"))
            .map(fox -> fox.getName().toString())
            .collect(Collectors.joining(", "));

  }
}
