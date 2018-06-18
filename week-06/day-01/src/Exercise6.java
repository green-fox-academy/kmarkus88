import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise6 {
  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>(Arrays.asList
            ("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    getWordsWithAAndI(cities);

  }
  private static void getWordsWithAAndI(List<String> cities) {
    cities.stream()
            .filter(t -> t.startsWith("A") && t.endsWith("I"))
            .forEach(System.out::print);
  }
}
