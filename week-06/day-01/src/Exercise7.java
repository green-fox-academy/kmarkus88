import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {

    String exampleText = "Write a Stream Expression to find the frequency of characters in a given string!";

    System.out.println(getCharFrequency(exampleText));
  }

  private static Map<Character, Long> getCharFrequency(String exampleText) {
    return exampleText.chars()
            .mapToObj(c -> (char) c)
            .map(Character::toLowerCase)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

  }
}
